package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class Take2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Take2Application.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
	  this.userRepository.save(new User("Yara", "Radwan", "1"));
	  this.userRepository.save(new User("Michelle", "Berry", "2"));
	  this.userRepository.save(new User("Maya", "Shankar", "3"));
	  this.userRepository.save(new User("Angeli", "Manipon", "4"));
	  
	}

}
