package com.googlesheets.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.googlesheets.demo.model.TeamBattingScorecardVO;
import com.googlesheets.demo.model.TeamBattingVO;

@Controller
@RequestMapping(path="/batting")
public class TeamBattingController {
	
	@PostMapping(path="/add")
	public @ResponseBody String addBattingInfo (@RequestBody TeamBattingVO battingInfo) {
			return "Batting Info Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<TeamBattingVO> getAllBattingInfo() {
		return null;
	}
	@GetMapping(path="/getBattingStatsByDate")
	public @ResponseBody TeamBattingScorecardVO getBattingInfoByDate (@RequestParam String date) {
		return null;
	}
	
	@GetMapping(path="/addTeamPerformance")
	public @ResponseBody String updateBattingInfo (@RequestParam String date) {

		return "{msg:\"Team Performance Saved"+"\"}";
	}

}
