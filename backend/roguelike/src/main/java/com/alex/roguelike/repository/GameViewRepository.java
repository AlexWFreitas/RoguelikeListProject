package com.alex.roguelike.repository;

import com.alex.roguelike.domain.GameDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameViewRepository extends JpaRepository<GameDetails, Long> {
	
}
