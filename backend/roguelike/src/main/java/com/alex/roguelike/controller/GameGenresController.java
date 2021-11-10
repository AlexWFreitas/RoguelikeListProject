package com.alex.roguelike.controller;

import java.net.URISyntaxException;
import java.util.List;

import com.alex.roguelike.domain.GameGenre;
import com.alex.roguelike.repository.GameGenreRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/genres")
public class GameGenresController {

	private final GameGenreRepository gameGenreRepository;

	public GameGenresController(GameGenreRepository gameGenreRepository) {
		super();
		this.gameGenreRepository = gameGenreRepository;
	}

	@RequestMapping(value = "/uploadGenre", method = RequestMethod.POST)
	public GameGenre postGameGenreWithImage(@RequestParam("file") MultipartFile file,
									 @RequestParam("genre") GameGenre gameGenre) {

		
		return gameGenreRepository.save(gameGenre);
	}
	
	@GetMapping("/")
	List<GameGenre> getGameGenres() {
		return gameGenreRepository.findAll();
	}

	@PostMapping("/") 
	ResponseEntity<GameGenre> createGameGenre (@RequestBody GameGenre gameGenre) throws URISyntaxException {
		GameGenre result = gameGenreRepository.save(gameGenre);
		return ResponseEntity.ok().body(result);
	}

	@PutMapping(value="/{id}")
	GameGenre updateGameGenre(@PathVariable Long id, @RequestBody GameGenre gameGenre) {
		gameGenre.setId(id);
		return gameGenreRepository.save(gameGenre);
	}

	@DeleteMapping("/{id}")
	void deleteGameGenre(@PathVariable Long id) {
		gameGenreRepository.deleteById(id);
	}	
}
