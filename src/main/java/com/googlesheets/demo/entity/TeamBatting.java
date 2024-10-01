package com.googlesheets.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="team_batting")
public class TeamBatting {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter
	@JsonIgnore
	private Integer id;
	
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "match_id", referencedColumnName = "ID")
	private MatchInfo matchId;
	
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "player_id", referencedColumnName = "ID")
	private Player player;
	
	@Getter
	@Setter
	private Integer runs;
	
	@Getter
	@Setter
	@Column(name="balls_faced")
	private Integer ballsFaced;
	
	@Getter
	@Setter
	private Integer ones;
	
	@Getter
	@Setter
	private Integer twos;
	
	@Getter
	@Setter
	private Integer threes;
	
	@Getter
	@Setter
	private Integer fours;
	
	@Getter
	@Setter
	private Integer sixes;
	
	@Getter
	@Setter
	@Column(name="strike_rate")
	private Double strikeRate;
	
	@Getter
	@Setter
	@Column(name="batting_pos")
	private Integer battingPos;
	
	@Getter
	@Setter
	@Column(name="kind_out")
	private String kindOut;
	
	/* Bowling data */
	@Getter
	@Setter
	@Column(name="over_no")
	private Integer overs;
	
	@Getter
	@Setter
	private Integer scores;
	
	@Getter
	@Setter
	private Integer wickets;
		
	@Getter
	@Setter
	private Integer wides;
	
	@Getter
	@Setter
	private Integer nbs;
	
	@Getter
	@Setter
	private Integer economy;
	
	@Getter
	@Setter
	private Integer maiden;
}
