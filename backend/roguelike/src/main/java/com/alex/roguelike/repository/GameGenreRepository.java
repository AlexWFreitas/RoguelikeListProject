package com.alex.roguelike.repository;

import com.alex.roguelike.domain.GameGenre;

import org.springframework.data.repository.CrudRepository;

public interface GameGenreRepository extends CrudRepository<GameGenre, Long> {
	
}
