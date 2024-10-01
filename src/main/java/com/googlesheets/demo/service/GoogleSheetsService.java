package com.googlesheets.demo.service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import com.googlesheets.demo.model.PlayerVO;
import com.googlesheets.demo.model.ScorecardVO;

public interface GoogleSheetsService {
    ScorecardVO getSpreadsheetValues() throws IOException, GeneralSecurityException;
    List<PlayerVO> getPlayerMap();
	List<PlayerVO> getTeam() throws IOException, GeneralSecurityException;
}
