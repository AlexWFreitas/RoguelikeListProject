package com.alex.roguelike.controller;

import java.net.URISyntaxException;
import java.util.Collection;

import com.alex.roguelike.domain.Game;
import com.alex.roguelike.repository.GameRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games")
@CrossOrigin
public class GamesController {
	private final GameRepository gameRepository;


	public GamesController(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	@GetMapping("/")
	Collection<Game> getGames() {
		return (Collection<Game>) gameRepository.findAll();
	}

	@PostMapping("/") 
	ResponseEntity<Game> createGame (@RequestBody Game game) throws URISyntaxException {
		Game result = gameRepository.save(game);
		return ResponseEntity.ok().body(result);
	}
}