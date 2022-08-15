package com.connect.demo;

import com.connect.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.connect.demo.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		List<User> listOfUsers = new ArrayList<User>();

		User u1 = new User("Ahmed","ahmed@cps.com","123456789");
		User u2 = new User("Abozaid","abozaid@cps.com","12345678");

		listOfUsers.add(u1);
		listOfUsers.add(u2);

		userRepository.insert(listOfUsers);

		 */
	}
}
