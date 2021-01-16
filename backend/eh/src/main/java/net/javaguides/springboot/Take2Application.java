package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.model.Scenario;
import net.javaguides.springboot.repository.ScenarioRepository;

@SpringBootApplication
public class Take2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Take2Application.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ScenarioRepository scenarioRepository;
	
	@Override
	public void run(String... args) throws Exception {
	  this.userRepository.save(new User("Yara", "Radwan", "1"));
	  this.userRepository.save(new User("Michelle", "Berry", "2"));
	  this.userRepository.save(new User("Maya", "Shankar", "3"));
	  this.userRepository.save(new User("Angeli", "Manipon", "4"));
	  this.scenarioRepository.save(new Scenario("Your friends want you to buy them ice cream. It will cost you 10$ at McDonald's.", "Yes, buy the icecream", -10, 0, 0, 0, "No, save my money", 0, 0, 0, 0)); 
	  this.scenarioRepository.save(new Scenario("You are offered a job at the local McDonald's. It will cost you $15 for the uniform, but you will make about $320 dollars a week working part-time.", "Yes, take the job offer", -15, 0, 320, 0, "No thank you", 0, 0, 0, 0));
	}

}
