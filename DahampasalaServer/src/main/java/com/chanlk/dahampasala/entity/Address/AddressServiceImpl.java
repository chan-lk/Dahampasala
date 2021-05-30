package com.chanlk.dahampasala.entity.Address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl {

	@Autowired
	private AddressRepository repo;

	public List<Address> listAll() {
		return repo.findAll();
	}

	public void save(Address dahampasala) {
		repo.save(dahampasala);
	}

	public Address get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

}
