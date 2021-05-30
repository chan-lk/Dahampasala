package com.chanlk.fnd.login.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

	@Autowired
	private RoleRepository repo;

	public List<Role> listAll() {
		return repo.findAll();
	}

	public void save(Role user) {
		repo.save(user);
	}

	public Role get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}
