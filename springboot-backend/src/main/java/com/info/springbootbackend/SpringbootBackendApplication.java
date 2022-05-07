package com.info.springbootbackend;

import com.info.springbootbackend.model.User;
import com.info.springbootbackend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("hamza", "aquebadou", "hamza@gmail.com"));
		this.userRepository.save(new User("lamyae", "aquebadou", "lamyae@gmail.com"));
		this.userRepository.save(new User("razan", "aquebadou", "razan@gmail.com"));

	}

}
