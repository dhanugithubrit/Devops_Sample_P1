package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;

@RestController
public class LoginController {
    @Autowired     
	private LoginService service;
	
    @RequestMapping("/login")
    public void savelogindetails(Login login) {
    	service.savelogin(login);
    	
    }
    
    @RequestMapping("/getall")
    public  List<Login> getlogindetails() {
    	System.out.println(service.getall().toString());
    	return service.getall();
    	
    }
	
}
