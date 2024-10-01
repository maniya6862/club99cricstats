package com.googlesheets.demo.service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.BatchGetValuesResponse;
import com.google.api.services.sheets.v4.model.Sheet;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.googlesheets.demo.config.GoogleAuthorizationConfig;
import com.googlesheets.demo.entity.Player;
import com.googlesheets.demo.model.Extras;
import com.googlesheets.demo.model.PlayerVO;
import com.googlesheets.demo.model.ScorecardVO;
import com.googlesheets.demo.model.TeamBaowlingScorecardVO;
import com.googlesheets.demo.model.TeamBattingScorecardVO;
import com.googlesheets.demo.model.TeamBattingVO;
import com.googlesheets.demo.model.TeamBowlingVO;
import com.googlesheets.demo.repo.PlayerRepository;

@Service
@Transactional
public class GoogleSheetsServiceImpl implements GoogleSheetsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleSheetsServiceImpl.class);

    @Value("${spreadsheet.id}")
    private String spreadsheetId;

    @Value("${spreadsheet.scorecard.id}")
    private String spreadsheetScorecardId;
    
    @Autowired
    private GoogleAuthorizationConfig googleAuthorizationConfig;
    
    public List<PlayerVO> playerMapFinal;
    
    @Autowired
    public PlayerRepository playerRepository;
    
    @Cacheable("Players")
    public List<PlayerVO> getPlayerMap(){
    	System.out.println(playerMapFinal);
    	return playerMapFinal;
    }

    @Override
    public ScorecardVO getSpreadsheetValues() throws IOException, GeneralSecurityException {
    	ScorecardVO sc=new ScorecardVO();
        Sheets sheetsService = googleAuthorizationConfig.getSheetsService();
        Sheets.Spreadsheets.Values.BatchGet request =
                sheetsService.spreadsheets().values().batchGet(spreadsheetId);
        Sheet sheet = getSheet(spreadsheetId);
        System.out.println(sheet.getProperties().getTitle());
        
        request.setRanges(getSpreadSheetRange(0,sheet));
        request.setMajorDimension("ROWS");
        BatchGetValuesResponse response = request.execute();
        List<List<Object>> spreadSheetValues = response.getValueRanges().get(0).getValues();
        List<Object> headers = spreadSheetValues.remove(0);
        
        Map<String,PlayerVO> playerMap=new HashMap<>();
        
        //getTeam
        playerMap=getPlayers(spreadSheetValues, headers);
        playerMapFinal =  new ArrayList<PlayerVO>(playerMap.values());
        
        //getScorecard
        Sheets sheetsService1 = googleAuthorizationConfig.getSheetsService();
        Sheets.Spreadsheets.Values.BatchGet request1 =
                sheetsService1.spreadsheets().values().batchGet(spreadsheetScorecardId);
        Sheet teamSheet = getSheet(spreadsheetScorecardId);
        System.out.println(sheet.getProperties().getTitle());
        
        request1.setRanges(getSpreadSheetRange(0,teamSheet));
        request1.setMajorDimension("ROWS");
        BatchGetValuesResponse response1 = request1.execute();
        List<List<Object>> spreadSheetValues1 = response1.getValueRanges().get(0).getValues();
        List<Object> headers1 = spreadSheetValues1.remove(0);
        
        System.out.println(teamSheet.getProperties().getTitle());
        String date=teamSheet.getProperties().getTitle().replace("ScoreSheet_", "");
        //getTeam
        return getMatchData(date,playerMap, spreadSheetValues1);
        
    }

    @Override
    public List<PlayerVO> getTeam() throws IOException, GeneralSecurityException {
    	ScorecardVO sc=new ScorecardVO();
        Sheets sheetsService = googleAuthorizationConfig.getSheetsService();
        Sheets.Spreadsheets.Values.BatchGet request =
                sheetsService.spreadsheets().values().batchGet(spreadsheetId);
        Sheet sheet = getSheet(spreadsheetId);
        System.out.println(sheet.getProperties().getTitle());
        
        request.setRanges(getSpreadSheetRange(0,sheet));
        request.setMajorDimension("ROWS");
        BatchGetValuesResponse response = request.execute();
        List<List<Object>> spreadSheetValues = response.getValueRanges().get(0).getValues();
        List<Object> headers = spreadSheetValues.remove(0);
        
        Map<String,PlayerVO> playerMap=new HashMap<>();
        
        //getTeam
        playerMap=getPlayers(spreadSheetValues, headers);
        playerMapFinal =  new ArrayList<PlayerVO>(playerMap.values());
        return playerMapFinal;

    }
	private Sheet getSheet(String id) throws IOException, GeneralSecurityException {
        Sheets sheetsService = googleAuthorizationConfig.getSheetsService();
        Sheets.Spreadsheets.Get request = sheetsService.spreadsheets().get(id);
        Spreadsheet spreadsheet = request.execute();
        Sheet sheet = spreadsheet.getSheets().get(0);
        return sheet;
	}

	private ScorecardVO getMatchData(String date,Map<String, PlayerVO> playerMap, List<List<Object>> spreadSheetValues) {
		ScorecardVO sc=new ScorecardVO();
		TeamBattingScorecardVO battingScorecardVO=new TeamBattingScorecardVO();
		TeamBaowlingScorecardVO bowlingScorecardVO=new TeamBaowlingScorecardVO();
        Extras battingExtras=new Extras();		
		List<TeamBattingVO> battingData=new ArrayList<TeamBattingVO>();
		List<TeamBowlingVO> bowlingData=new ArrayList<TeamBowlingVO>();
		
		int battingTotal=0;
        int bowlingTotal=0;
        for ( List<Object> row : spreadSheetValues ) {
        	try {
        	//Batting info
        	TeamBattingVO bat=new TeamBattingVO();
        	int i=0;
        	bat.setBattingPos(getValue(row.get(i++)));

        	String name=getSValue(row.get(i++));
        	System.out.println("["+date+"] Starting to read batting records for "+name);
        	PlayerVO player=playerMap.get(name);
        	if(player==null) {
        		player=new PlayerVO();
        		player.setName(name);
        	}

        	bat.setPlayerName(player.getName());
        	bat.setRuns(getValue(row.get(i++)));
        	bat.setBallsFaced(getValue(row.get(i++)));
        	bat.setKindOut(getSValue(row.get(i++)));
        	
        	bat.setOnes(getValue(row.get(i++)));
        	bat.setTwos(getValue(row.get(i++)));
        	bat.setThrees(getValue(row.get(i++)));
        	bat.setFours(getValue(row.get(i++)));
        	bat.setSixes(getValue(row.get(i++)));
           	battingData.add(bat);
           	
           	TeamBowlingVO ball=new TeamBowlingVO();        	
           	ball.setOvers(getValue(row.get(i++)));
           	ball.setMaiden(getValue(row.get(i++)));
           	ball.setScores(getValue(row.get(i++)));
           	ball.setWickets(getValue(row.get(i++)));
           	ball.setEconomy(getDValue(row.get(i++)));
           	ball.setWides(getValue(row.get(i++)));
           	ball.setNbs(getValue(row.get(i++)));
           	ball.setByes(getValue(row.get(i++)));
           	ball.setDotBalls(getValue(row.get(i++)));

        	ball.setPlayerName(name);
        	bowlingData.add(ball);
        	
        	battingExtras.setWides(getValue(row.get(i++)));
           	battingExtras.setByes(getValue(row.get(i++)));
           	battingExtras.setNb(getValue(row.get(i++)));
           	battingExtras.setOthers(getValue(row.get(i++)));
           	battingTotal=getValue(row.get(i));
        	}catch(java.lang.IndexOutOfBoundsException e) {
        		//System.out.println(e);
        		continue;
        	}
        }
        battingScorecardVO.setTeamBatting(battingData);
		battingScorecardVO.setExtras(battingExtras);
		
        bowlingScorecardVO.setTeamBownling(bowlingData);
		bowlingScorecardVO.setTotal(bowlingTotal);
        
        sc.setTeamBatting(battingScorecardVO);
        sc.setTeamBownling(bowlingScorecardVO);
        
        sc.setMatchDate(date);
		return sc;
	}
	
	private String getSValue(Object object) {
		if(object==null) {
			return "";
		}
		return object.toString();
	}
	private Double getDValue(Object object) {
		if(object==null) {
			return 1D;
		}
		return Double.parseDouble(object.toString());
	}
	
	private Integer getValue(Object object) {
		if(object==null) {
			return 0;
		}
		return Integer.parseInt(object.toString());
	}

	private Map<String, PlayerVO> getPlayers(List<List<Object>> spreadSheetValues, List<Object> headers) {
		Map<String, PlayerVO> playerMap = new HashMap<String, PlayerVO>();
        for ( List<Object> row : spreadSheetValues ) {
        	PlayerVO p=new PlayerVO();
        	p.setName(row.get(0).toString());
        	p.setBatting(row.get(1).toString());
        	p.setBowling(row.get(2).toString());
        	p.setPhone(row.get(3).toString());
        	p.setAge(Integer.parseInt(row.get(4).toString()));
        	
        	playerMap.put(p.getName(), p);
            LOGGER.info("{}: {}, {}: {}, {}: {}, {}: {}",
                    headers.get(0),
                    row.get(0), 
                    headers.get(1),
                    row.get(1),
                    headers.get(2),
                    row.get(2),
                    headers.get(3),
                    row.get(3));
            
        	Player player=new Player();
        	player.setName(row.get(0).toString());
        	player.setBatting(row.get(1).toString());
        	player.setBowling(row.get(2).toString());
        	player.setPhone(row.get(3).toString());
        	player.setAge(Integer.parseInt(row.get(4).toString()));
        	playerRepository.save(player);
        }
        
        
        return playerMap;
	}

    private List<String> getSpreadSheetRange(int index, Sheet sheet) throws IOException, GeneralSecurityException {        
        int row = sheet.getProperties().getGridProperties().getRowCount();
        int col = sheet.getProperties().getGridProperties().getColumnCount();
        return Collections.singletonList("R1C1:R".concat(String.valueOf(row))
                .concat("C").concat(String.valueOf(col)));
    }
    
}
