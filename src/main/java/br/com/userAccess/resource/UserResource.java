package br.com.userAccess.resource;

import br.com.userAccess.domain.User;
import br.com.userAccess.domain.dto.UserDTO;
import br.com.userAccess.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * @Author Marcelo Nascimento
 * @Date 13 de fev de 2019
 * @Project user-access
 * @Package resource
 * @Desc Resources to define end points to user.
 */

@RestController
@RequestMapping("/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> show() {
		List<User> list = userService.all();
 		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/paginate")
	public ResponseEntity<Page<User>> paginate(
			@RequestParam(value = "page", defaultValue = "0") Integer page, 
			@RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage, 
			@RequestParam(value = "orderBy", defaultValue = "login") String orderBy, 
			@RequestParam(value = "direction", defaultValue = "DESC")String direction) {
		Page<User> list = userService.paginateUser(page, linesPerPage, orderBy, direction);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value="/findByUsername")
	public ResponseEntity<User> findByUsername(@RequestParam(value = "username") String username) {
		User user = userService.findByUsername(username);
		return ResponseEntity.ok(user);
	}

	@GetMapping(value="/{id}")
	public ResponseEntity<User> findOne(@PathVariable Integer id) {
		User user = userService.findOne(id);
		return ResponseEntity.ok(user);
	}

	@GetMapping(value="/myProfile")
	public ResponseEntity<User> myProfile() {
		User user = userService.myProfile();
		return ResponseEntity.ok(user);
	}

	@PostMapping
	public ResponseEntity<Void> create(@RequestBody UserDTO dto) {
		User user = dto.fromEntity();
		user = userService.create(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(user.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> update(@RequestBody User user, @PathVariable Integer id) {
		userService.update(user, id);
		return ResponseEntity.noContent().build();
	}
}
