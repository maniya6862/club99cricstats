package com.googlesheets.demo.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.googlesheets.demo.model.PlayerVO;
import com.googlesheets.demo.model.ScorecardVO;
import com.googlesheets.demo.service.GoogleSheetsService;

@RestController
@RequestMapping(value = "/api/v1/googlesheets")
public class GoogleSheetsController {

    @Autowired
    private GoogleSheetsService googleSheetsService;

    @GetMapping(value="ping")
    public ScorecardVO getSpreadsheetValues() throws IOException, GeneralSecurityException {
        return googleSheetsService.getSpreadsheetValues();
    }
    
    @GetMapping(value="loadPlayers")
    public List<PlayerVO> getPlayersSpreadsheetValues() throws IOException, GeneralSecurityException {
        return googleSheetsService.getTeam();
    }
    @GetMapping(value="loadMatch")
    public List<PlayerVO> getMatchSpreadsheetValues() throws IOException, GeneralSecurityException {
        return googleSheetsService.getTeam();
    }
}
