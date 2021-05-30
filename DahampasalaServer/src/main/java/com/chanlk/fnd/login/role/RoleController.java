///package com.chanlk.fnd.login.role;
package com.chanlk.fnd.login.role;

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
@RequestMapping("/chanlk/fnd/role")
public class RoleController {

	@Autowired
	private RoleService service;

	@GetMapping
	public List<Role> list() {
		return service.listAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Role> get(@PathVariable Long id) {
		try {
			Role role = service.get(id);
			return new ResponseEntity<Role>(role, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Role>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping
	public void add(@RequestBody Role role) {
		service.save(role);

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Role role, @PathVariable Long id) {
		try {
			Role existRole = service.get(id);
			role.setRoleId(existRole.getRoleId());
			service.save(role);
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
