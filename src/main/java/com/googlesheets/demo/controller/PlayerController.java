package com.googlesheets.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.googlesheets.demo.model.DetailsPlayerStatsPerMatchVO;
import com.googlesheets.demo.model.PlayerScatteredScoresVO;
import com.googlesheets.demo.model.PlayerVO;
import com.googlesheets.demo.model.RunsPercentageStatsVO;
import com.googlesheets.demo.service.GoogleSheetsService;

@Controller
@RequestMapping(path="/api/player")
public class PlayerController {
	
	@Autowired
	GoogleSheetsService service;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<PlayerVO> getAllPlayers() {		
		System.out.println("returning team players");
		return service.getPlayerMap();
	}
	@GetMapping(path="/getPlayerByName")
	public @ResponseBody PlayerVO getPlayerByName(@RequestParam String name) {
		PlayerVO response = null;
		
		return response;
	}
	@GetMapping(path="/getRunsPercentage")
	public @ResponseBody RunsPercentageStatsVO getRunsPercentageByName(@RequestParam String name) {
		return null;
	}
	
	@GetMapping(path="/getPlayerDetailsByName")
	public @ResponseBody List<DetailsPlayerStatsPerMatchVO> getPlayerDetailsByName(@RequestParam String name) {
		return null;
	}
	@GetMapping(path="/getScatteredScoresUser")
	public @ResponseBody PlayerScatteredScoresVO getScatteredScoresUser(@RequestParam String name) {
		return null;
	}
	@GetMapping(path="/getPlayerById")
	public @ResponseBody PlayerVO getPlayerById (@RequestParam Integer id) {
		PlayerVO playerToPlayerVo = null;
		return playerToPlayerVo;
	}
}
