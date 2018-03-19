package com.hootboard.assignment.user;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hootboard.assignment.model.UserDTO;

/**
 * @author MrSagar
 *
 */
@Service
public class UserServiceImpl implements UserService {

	private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	private static List<UserDTO> users;

	private static final AtomicLong counter = new AtomicLong();

	static {
		users = populateDummyUsers();
	}

	@Override
	public String test() {
		return "test pass";
	}

	@Override
	public List<UserDTO> getAllUsers() {
		logger.info("getAllUsers() START :: " + UserServiceImpl.class);
		return users;

	}

	@Override
	public UserDTO saveUser(UserDTO userDTO) {
		logger.info("saveUser() START :: " + UserServiceImpl.class);
		return null;
	}

	@Override
	public UserDTO updateUser(UserDTO userDTO) {
		return null;
	}

	@Override
	public UserDTO delete(Integer id) {
		logger.info("Deleting a User entry with id: {}", id);
		return null;
	}

	private static List<UserDTO> populateDummyUsers() {
		List<UserDTO> users = new ArrayList<UserDTO>();
		users.add(new UserDTO(counter.incrementAndGet(), "FName1", "LName1", null, null));
		users.add(new UserDTO(counter.incrementAndGet(), "FName2", "LName2", null, null));
		users.add(new UserDTO(counter.incrementAndGet(), "FName3", "LName3", null, null));
		users.add(new UserDTO(counter.incrementAndGet(), "FName4", "LName4", null, null));
		users.add(new UserDTO(counter.incrementAndGet(), "FName5", "LName5", null, null));
		return users;
	}

}
