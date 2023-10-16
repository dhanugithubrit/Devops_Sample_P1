package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.LoginDAO;
import com.example.demo.entity.Login;

@Service
public class LoginService {
	@Autowired
	private LoginDAO repo;
	

	public void savelogin(Login login) {
		repo.save(login);
		
		
		
	}
	
	public List<Login> getall() {
		return repo.findAll();
		
	}
}
