package com.alex.roguelike.controller;

import java.net.URISyntaxException;
import java.util.Optional;

import com.alex.roguelike.domain.GameDetails;
import com.alex.roguelike.repository.GameDetailsRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games/{gameId}")
public class GameDetailsController {

	private final GameDetailsRepository gameDetailsRepository;

	public GameDetailsController(GameDetailsRepository gameDetailsRepository) {
		this.gameDetailsRepository = gameDetailsRepository;
	}

	@GetMapping("/")
	Optional<GameDetails> getGameDetailsByGameId (@PathVariable Long gameId) {
		return gameDetailsRepository.findByGame_Id(gameId);
	}

	@PostMapping("/") 
	ResponseEntity<GameDetails> createGameGenre (@RequestBody GameDetails gameDetails) throws URISyntaxException {
		GameDetails result = gameDetailsRepository.save(gameDetails);
		return ResponseEntity.ok().body(result);
	}

	@PutMapping("/")
	GameDetails updateGameGenre (@PathVariable Long gameId, @RequestBody GameDetails gameDetails) {
		var gameDetailsOriginal = gameDetailsRepository.findByGame_Id(gameId);
		gameDetails.setId(gameDetailsOriginal.get().getId());
		return gameDetailsRepository.save(gameDetails);
	}

	@DeleteMapping("/")
	void deleteGameGenre (@PathVariable Long gameId) {
		var gameDetailsOriginal = gameDetailsRepository.findByGame_Id(gameId);
		gameDetailsRepository.deleteById(gameDetailsOriginal.get().getId());
	}	
	
}
