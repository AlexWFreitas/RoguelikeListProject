package com.alex.roguelike.repository;

import java.util.Optional;

import com.alex.roguelike.domain.GameDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameDetailsRepository extends JpaRepository<GameDetails, Long> {
	Optional<GameDetails> findByGame_Id(Long Id);
}
