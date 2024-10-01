package com.googlesheets.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.googlesheets.demo.model.PlayerVO;
import com.googlesheets.demo.model.WinLossRatio;

@Controller
public class DashboardController {

	@RequestMapping("/dashboard")
	public ModelAndView thymeleafView(Model model) {
	    return new ModelAndView("dashboard");
	}
	@GetMapping("/getWinLossRatio")
	public @ResponseBody WinLossRatio getWinLossRatio() {
		WinLossRatio resp = new WinLossRatio();
		resp.setWon(5);
		resp.setLoss(5);
		return resp;
	}
	@GetMapping("/getTopScorers")
	public @ResponseBody List<PlayerVO> getTopScorers() {
		/* Get players details */
	
		return null;
	}
	@GetMapping("/getTopWicketTakers")
	public @ResponseBody List<PlayerVO> getTopWicketTakers() {
		/* Get players details */
	
		return null;
	}
	@GetMapping("/getBoundaryHitters")
	public @ResponseBody List<PlayerVO> getBoundaryHitters() {
		/* Get players details */
		
		return null;
	}
	@GetMapping("/getBoundaryHittersPerMatch")
	public @ResponseBody List<PlayerVO> getBoundaryHittersPerMatch() {
		/* Get players details */

		return null;
	}
	@GetMapping("/getSixHitters")
	public @ResponseBody List<PlayerVO> getSixHitters() {
		/* Get players details */
		
		return null;
	}
	@GetMapping("/getIndividualTopScorers")
	public @ResponseBody List<PlayerVO> getIndividualTopScorer() {
		/* Get players details */
		
		return null;
	}
	@GetMapping("/getIndividualTopEconomy")
	public @ResponseBody List<PlayerVO> getIndividualTopEconomy() {
		/* Get players details */
		
		return null;
	}
	@GetMapping("/getDotStats")
	public @ResponseBody List<PlayerVO> getDotStats() {
		/* Get players details */
		
		return null;
	}
	@GetMapping("/getContibutionInWins")
	public @ResponseBody  List<PlayerVO> getContibutionInWins() {
		/* Get players details */
		/*Iterable<PlayerVO> allPlayers = controller.getAllPlayers();
		Map<String, WinContributionVO> winContribution = playerStatsRepository.getWinContribution();
		for(PlayerVO player:allPlayers) {
			WinContributionVO winContributionVO = winContribution.get(player.getName());
			if(null!=winContributionVO) {
				player.getStats().setAvgInWin(winContributionVO.getAvg());
				player.getStats().setPartOfTeamInWin(winContributionVO.getMatches());
			}
		}
		
		List<PlayerVO> newList = new ArrayList<PlayerVO>();
		for(PlayerVO player:allPlayers) {
			if(null!=player.getStats().getAvgInWin() && !player.getStats().getAvgInWin().equals(0.0) && 
					Integer.parseInt(player.getStats().getInnings())>5) {
				newList.add(player);
			}
		}
		
		List<PlayerVO> result = 
				  StreamSupport.stream(newList.spliterator(), false)
				    .collect(Collectors.toList());
		Collections.sort(result,new WinContributionSortingComparatorVO());
		
		List<PlayerVO> reverseOrder=new ArrayList<PlayerVO>(result.size());
		
		for(int i=1;i<=result.size()-1;i++) {
			reverseOrder.add(i-1, result.get(result.size()-i));
		}
		return reverseOrder;*/
		return null;
	}
	@GetMapping("/getEconomyInWins")
	public @ResponseBody  List<PlayerVO> getEconomyInWins() {
		/* Get players details */
		/*Iterable<PlayerVO> allPlayers = controller.getAllPlayers();
		Map<String, WinContributionVO> ecoContribution = playerStatsRepository.getEconomyInWins();
		for(PlayerVO player:allPlayers) {
			WinContributionVO winContributionVO = ecoContribution.get(player.getName());
			if(null!=winContributionVO) {
				player.getStats().setEcoInWin(winContributionVO.getEco());
				player.getStats().setPartOfTeamInWin(winContributionVO.getMatches());
			}
		}
		
		List<PlayerVO> newList = new ArrayList<PlayerVO>();
		for(PlayerVO player:allPlayers) {
			if(null!=player.getStats().getEcoInWin() && !player.getStats().getEcoInWin().equals(0.0) && 
					Integer.parseInt(player.getStats().getInnings())>5) {
				newList.add(player);
			}
		}
		
		List<PlayerVO> result = 
				  StreamSupport.stream(newList.spliterator(), false)
				    .collect(Collectors.toList());
		Collections.sort(result,new WinEcoContributionSortingComparatorVO());
		return result;*/
		return null;
	}
	@RequestMapping("/details")
	public ModelAndView thymeleafDetailView(Model model) {
		/* Get players details */
		
	    return new ModelAndView("details");
	}
	
}
