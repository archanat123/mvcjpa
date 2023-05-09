package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;
import com.example.demo.services.UserServices;


@RestController
@RequestMapping(path = "users")
public class UserController {


	@Autowired
	 private UserServices service;
	
	@GetMapping
	public List<User> getUsers()
	{
	return service.getUsers();
	}
	
	@GetMapping(path="/{id}")
	public User user(@PathVariable Integer id)
	{
		return service.getUsers(id);
	}
	@PostMapping
	public User addUser(@RequestBody User user)
	{
		return service.addUser(user);
		
	}
}
