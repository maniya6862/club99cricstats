package com.googlesheets.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.googlesheets.demo.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
}

