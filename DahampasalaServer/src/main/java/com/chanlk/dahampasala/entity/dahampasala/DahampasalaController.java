package com.chanlk.dahampasala.entity.dahampasala;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/chanlk/daham/dahampasala")
public class DahampasalaController {

	@Autowired
	private DahampasalaServiceImpl service;

	@GetMapping
	public List<Dahampasala> list() {
		return service.listAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Dahampasala> get(@PathVariable Long id) {
		try {
			Dahampasala dahampasala = service.get(id);
			return new ResponseEntity<Dahampasala>(dahampasala, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Dahampasala>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping
	public void add(@RequestBody Dahampasala dahampasala) {
		service.save(dahampasala);

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Dahampasala dahampasala, @PathVariable String id) {
		try {
			
			Dahampasala existDahampasala = service.get(Long.parseLong(id));
			dahampasala.setId(existDahampasala.getId());
			service.save(dahampasala);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
