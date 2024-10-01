package com.googlesheets.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.googlesheets.demo.model.MatchInfo;
import com.googlesheets.demo.model.MatchVO;

@Controller	
public class MatchController {
	
	@PostMapping(path="/match/add")
	public @ResponseBody String addNewMatch (@RequestBody MatchVO match) {
		return "Match Info Saved";
	}

	@GetMapping(path="/match/all")
	public @ResponseBody Iterable<MatchInfo> getAllMatches() {
		return null;
	}
	
	@GetMapping(path="/match/getMatchByDate")
	public @ResponseBody MatchVO getMatchInfo (@RequestParam String date) {
		MatchVO response = null;
		return response;
	}
	
	@RequestMapping("/matches")
	public ModelAndView thymeleafView(Model model) {
		return new ModelAndView("matches");
	}
}
