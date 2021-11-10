package com.alex.roguelike.repository;

import com.alex.roguelike.domain.GameGenre;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameGenreRepository extends JpaRepository<GameGenre, Long> {
	
}
