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
      this.scenarioRepository.save(new Scenario("Do you want to buy a wallet? It costs 20$", 17, "Yes, I would like to. I gain 3$ in income annually because I don't lose money anymore.", -20, 0, 3, "No thanks, I have pockets. You drop 5$ as you walk away.", 0, 5, 0));
      this.scenarioRepository.save(new Scenario("Oh no! You have been diagnosed with nearsightedness and you need 200$ to buy new glasses.", 18, "Yes, buy the glasses", -200, 0, 0, "Don't buy the glasses, live in constant discomfort.", 0, 0, 0));
      this.scenarioRepository.save(new Scenario("If you took the job, do you want to quit your job? You can sell the uniform for $10 on kijiji.", 19, "Yes! Quit my job", 10, 0, -320, "No, I need the income for living expenses.", 0, 0, 0));
    }
    
}

