package com.alex.roguelike.repository;

import com.alex.roguelike.domain.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
