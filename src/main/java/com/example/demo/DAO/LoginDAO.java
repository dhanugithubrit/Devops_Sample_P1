package com.example.demo.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Login;

public interface LoginDAO extends JpaRepository<Login, Integer>{
	

}
