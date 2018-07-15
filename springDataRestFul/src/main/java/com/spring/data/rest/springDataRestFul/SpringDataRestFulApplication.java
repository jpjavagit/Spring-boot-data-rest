package com.spring.data.rest.springDataRestFul;

import com.spring.data.rest.springDataRestFul.repository.HamburgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class SpringDataRestFulApplication {
	@Autowired
	HamburgerRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestFulApplication.class, args);
	}
}
