package com.intissar.demo.service;


import java.util.*;

import com.intissar.demo.entities.Role;
import com.intissar.demo.entities.User;


public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	
	List<User> findAllUsers();
}