package com.chanlk.dahampasala.entity.Address;

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
@RequestMapping("/chanlk/daham/address")
public class AddressController {
	
	@Autowired
	AddressServiceImpl service;

	@GetMapping
	public List<Address> list() {
		return service.listAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Address> get(@PathVariable Long id) {
		try {
			Address address = service.get(id);
			return new ResponseEntity<Address>(address, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Address>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping
	public void add(@RequestBody Address address) {
		service.save(address);

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Address address, @PathVariable String id) {
		try {
			
			Address existAddress = service.get(Long.parseLong(id));
			address.setId(existAddress.getId());
			service.save(address);
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
