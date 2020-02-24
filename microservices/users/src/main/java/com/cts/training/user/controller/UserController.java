package com.cts.training.user.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.training.user.entity.User;
import com.cts.training.user.exception.UserErrorResponse;
import com.cts.training.user.exception.UserNotFoundException;
import com.cts.training.user.service.IUserService;







@Controller
public class UserController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private IUserService userService;
	
	// @RequestMapping(value =  "/products", method = {RequestMethod.GET, RequestMethod.PUT} )
	@GetMapping("/users") 
	public ResponseEntity<List<User>> exposeAll() {
		
		List<User> users = this.userService.findAllUsers();
		// if(products.size() == 0)
		if(users== null)
			throw new UserNotFoundException("Not able to fetch records!!!");
		ResponseEntity<List<User>> response = 
								new ResponseEntity<List<User>>(users, HttpStatus.OK);
		
		
		return response;
	}
	
	// {<data variable>}
	@GetMapping("/users/{userId}") // GET HTTP VERB
	public ResponseEntity<User> getById(@PathVariable Integer userId) {
		
		User user = this.userService.findUserById(userId);
		if(user== null)
			throw new UserNotFoundException("User with id-" + userId + " not Found");
		
		ResponseEntity<User> response = 
				new ResponseEntity<User>(user, HttpStatus.OK);

		return response;
	}
	
	// @RequestMapping(value =  "/products", method = RequestMethod.POST)
	@PostMapping("/users") // POST HTTP VERB
	public ResponseEntity<User> save(@RequestBody User user) {
		if(!this.userService.addUser(user))
			throw new RuntimeException("Could not add new record!!!");
		ResponseEntity<User> response = 
				new ResponseEntity<User>(user, HttpStatus.OK);

		return response;
	}
	
	@PutMapping("/users")
	public ResponseEntity<User> saveUpdate(@RequestBody User user) {
		if(!this.userService.updateUser(user))
			throw new RuntimeException("Could not update record!!!");
		ResponseEntity<User> response = 
				new ResponseEntity<User>(user, HttpStatus.OK);

		return response;
	}
	
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<User> delete(@PathVariable Integer userId) {
		
		User user = this.userService.findUserById(userId);
		if(user== null)
			throw new UserNotFoundException("User with id-" + userId + " not Found");
		
		// send productId to DAO via SERVICE
		this.userService.deleteUser(userId);
		
		ResponseEntity<User> response = 
				new ResponseEntity<User>(user, HttpStatus.OK);

		return response;
	}
	
	
	// for exception handling
	@ExceptionHandler  // ~catch
	public ResponseEntity<UserErrorResponse> userNotFoundHandler(UserNotFoundException ex) {
		// create error object
		UserErrorResponse error = new UserErrorResponse(ex.getMessage(), 
															  HttpStatus.NOT_FOUND.value(), 
															  System.currentTimeMillis());
		ResponseEntity<UserErrorResponse> response =
										new ResponseEntity<UserErrorResponse>(error, HttpStatus.NOT_FOUND);
		
		return response;
	}
	
	@ExceptionHandler  // ~catch
	public ResponseEntity<UserErrorResponse> userOperationErrorHAndler(Exception ex) {
		// create error object
		UserErrorResponse error = new UserErrorResponse(ex.getMessage(), 
															  HttpStatus.BAD_REQUEST.value(), 
															  System.currentTimeMillis());
		ResponseEntity<UserErrorResponse> response =
										new ResponseEntity<UserErrorResponse>(error, HttpStatus.NOT_FOUND);
		logger.error("Exception :" + error);
		
		return response;
	}
	
	


}
