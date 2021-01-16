package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.javaguides.springboot.model.Scenario;
import net.javaguides.springboot.repository.ScenarioRepository;

@SpringBootApplication
public class ElleHacksApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ElleHacksApplication.class, args);
    }

    @Autowired
    private ScenarioRepository scenarioRepository;
    
    @Override
    public void run(String... args) throws Exception {
      this.scenarioRepository.save(new Scenario("Your friends want you to buy them ice cream. It will cost you 10$ at McDonald's.", 16, "Yes, buy the icecream", -10, 0, 0, "No, save my money", 0, 0, 0)); 
      this.scenarioRepository.save(new Scenario("You are offered a job at the local McDonald's. It will cost you $15 for the uniform, but you will make about $320 dollars a week working part-time.", 16, "Yes, take the job offer", -15, 0, 320, "No thank you. I should be focusing only on school right now.", 0, 0, 0));
    }
    
}

