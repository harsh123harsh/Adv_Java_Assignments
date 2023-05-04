package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SignUpDao;
import com.entitites.Credentials;

@Service
public class UserService {
	
	@Autowired
	private SignUpDao signUpDao;
	
	
public int createUser(Credentials user) {
	return this.signUpDao.saveUser(user);
}

public boolean validateUser(Credentials user) {
	return signUpDao.getUser(user.getUsername(),user.getPassword());
}
}
