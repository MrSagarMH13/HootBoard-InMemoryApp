package com.hootboard.assignment.user;

import java.util.List;

import com.hootboard.assignment.model.UserDTO;

/**
 * @author MrSagar
 *
 */
public interface UserService {

	String test();

	List<UserDTO> getAllUsers();

	UserDTO saveUser(UserDTO user);

	UserDTO updateUser(UserDTO user);

	UserDTO delete(Integer id);

}
