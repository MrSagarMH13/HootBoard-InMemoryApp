package com.hootboard.assignment.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hootboard.assignment.model.UserDTO;

/**
 * @author MrSagar
 *
 */
@RestController
@RequestMapping("api/v1/")
public class UserController {

	private final static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value = "/user/new", method = RequestMethod.POST)
	public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO user) {
		logger.info("Inside saveUser()" + UserController.class);
		UserDTO response = userService.saveUser(user);
		return new ResponseEntity<UserDTO>(response, new HttpHeaders(),
				response != null ? HttpStatus.CREATED : HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@RequestMapping(value = "/user/get-all", method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> getAllUsers() {
		logger.info("Inside getAllUsers()" + UserController.class);
		List<UserDTO> response = userService.getAllUsers();
		return new ResponseEntity<List<UserDTO>>(response, new HttpHeaders(),
				response != null ? HttpStatus.CREATED : HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@RequestMapping(value = "/user/update", method = RequestMethod.POST)
	public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO user) {
		logger.info("Inside updateUser()" + UserController.class);
		UserDTO response = userService.updateUser(user);
		return new ResponseEntity<UserDTO>(response, new HttpHeaders(),
				response != null ? HttpStatus.CREATED : HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<UserDTO> delete(@PathVariable("id") Integer id) {
		logger.info("Deleting a User entry with id: {}", id);
		UserDTO response = userService.delete(id);
		return new ResponseEntity<UserDTO>(response, new HttpHeaders(),
				response != null ? HttpStatus.CREATED : HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
