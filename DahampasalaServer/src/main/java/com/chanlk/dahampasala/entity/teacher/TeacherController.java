package com.chanlk.dahampasala.entity.teacher;

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
@RequestMapping("/chanlk/daham/teacher")
public class TeacherController {

	@Autowired
	private TeacherService service;

	@GetMapping
	public List<Teacher> list() {
		return service.listAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Teacher> get(@PathVariable Long id) {
		try {
			Teacher teacher = service.get(id);
			return new ResponseEntity<Teacher>(teacher, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Teacher>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping
	public void add(@RequestBody Teacher teacher) {
		service.save(teacher);

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Teacher teacher, @PathVariable Long id) {
		try {
			Teacher existTeacher = service.get(id);
			teacher.setId(existTeacher.getId());
			service.save(teacher);
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
