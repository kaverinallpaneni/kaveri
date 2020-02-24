package com.cts.training.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.user.entity.User;
import com.cts.training.user.repository.UserRepository;

@Service
public class UserServiceImpl  implements IUserService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAllUsers() {
		
		return this.userRepository.findAll();
	}
	
	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		
		Optional<User> record =  this.userRepository.findById(id);
		
		User user = new User();
		if(record.isPresent())
			user = record.get();
		return user;
		
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		this.userRepository.save(user);
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		this.userRepository.save(user);
		return true;
	}

	@Override
	public boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);
		return true;
	}

}

