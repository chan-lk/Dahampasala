package com.chanlk.dahampasala.entity.dahampasala;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DahampasalaServiceImpl implements DahampasalaService {

	@Autowired
	private DahampasalaRepository repo;

	public List<Dahampasala> listAll() {
		return repo.findAll();
	}

	public void save(Dahampasala dahampasala) {
		repo.save(dahampasala);
	}

	public Dahampasala get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}
