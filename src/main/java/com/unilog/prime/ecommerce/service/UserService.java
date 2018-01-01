package com.unilog.prime.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.unilog.prime.ecommerce.entity.User;

@Service
public class UserService {
	private List<User> allUsers=new ArrayList<>();
	public List<User> getAllUsers(){
		return allUsers;
	}
	public void addUser(User user) {
		allUsers.add(user);
	}
	
}
