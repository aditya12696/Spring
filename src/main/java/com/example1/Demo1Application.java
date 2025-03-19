package com.example1;

import com.example1.model.Alien;
import com.example1.repository.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(Demo1Application.class, args);
		Alien alien = context.getBean(Alien.class);
		alien.setId(100);
		alien.setName("Adi");
		alien.setTech("Java");

	}

}
