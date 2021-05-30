package com.chanlk.dahampasala.entity.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository repo;

	public List<Teacher> listAll() {
		return repo.findAll();
	}

	public void save(Teacher teacher) {
		repo.save(teacher);
	}

	public Teacher get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}
