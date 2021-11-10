package com.alex.roguelike.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.alex.roguelike.storage.StorageFileNotFoundException;
import com.alex.roguelike.storage.StorageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

@RestController
@CrossOrigin
public class StorageController {

	private final StorageService storageService;

	@Autowired
	public StorageController(StorageService storageService) {
		this.storageService = storageService;
	}

	@GetMapping("/files")
	public List<String> listUploadedFiles() throws IOException {

		List<String> result = storageService.loadAll().map(
				path -> MvcUriComponentsBuilder.fromMethodName(StorageController.class,
						"serveFile", path.getFileName().toString()).build().toUri().toString())
				.collect(Collectors.toList());

		return result;
	}

	@GetMapping("/files/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

		Resource file = storageService.loadAsResource(filename);
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
				"attachment; filename=\"" + file.getFilename() + "\"").body(file);
	}

	@PostMapping("/files/")
	public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
		
		String filename = "";

		if (file.getOriginalFilename().lastIndexOf(".") != -1)
		{
			filename = UUID.randomUUID().toString() + "." +  file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
		}
		else
		{
			filename = UUID.randomUUID().toString();
		}

		Path TO = Paths.get(String.format("./uploaded-files/%s", filename));
		try {
			try {
				Files.copy(file.getInputStream(), TO);
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("FAIL2! -> message2 = " + e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(
				"Error -> message = " + e.getMessage(),
          		HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(
				"You successfully uploaded " + file.getOriginalFilename() + "!",
          		HttpStatus.OK);
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		return ResponseEntity.notFound().build();
	}

}