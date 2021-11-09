package com.alex.roguelike.controller;

import com.alex.roguelike.domain.GameGenre;
import com.alex.roguelike.repository.GameGenreRepository;

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
	public GameGenre postGenreWithImage(@RequestParam("file") MultipartFile file,
									 @RequestParam("genre") GameGenre gameGenre) {

		
		return gameGenreRepository.save(gameGenre);
	}
	
}
