package com.alex.roguelike.controller;

import java.net.URISyntaxException;
import java.util.List;

import com.alex.roguelike.domain.Game;
import com.alex.roguelike.repository.GameRepository;

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
@RequestMapping("/api/games")
public class GamesController {
	private final GameRepository gameRepository;

	public GamesController(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	@GetMapping("/")
	List<Game> getGames() {
		return gameRepository.findAll();
	}

	@PostMapping("/") 
	ResponseEntity<Game> createGame (@RequestBody Game game) throws URISyntaxException {
		Game result = gameRepository.save(game);
		return ResponseEntity.ok().body(result);
	}

	@PutMapping(value="/{id}")
	Game updateGame(@PathVariable Long id, @RequestBody Game game) {
		game.setId(id);
		return gameRepository.save(game);
	}

	@DeleteMapping("/{id}")
	void deleteGame(@PathVariable Long id) {
		gameRepository.deleteById(id);
	}
}
