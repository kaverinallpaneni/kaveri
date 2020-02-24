package com.cts.training.user.service;

import java.util.List;

import com.cts.training.user.entity.User;


public interface IUserService {

	List<User> findAllUsers();
	User findUserById(Integer id);
	boolean addUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(Integer id);
}
