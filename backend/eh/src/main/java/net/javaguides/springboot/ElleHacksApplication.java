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
    this.scenarioRepository.save(new Scenario(
        "You are offered a part-time job at the local McDonald's. It will cost you $15 for the uniform, "
        + "but you will make about $170 weekly if you work for just 2 days. This will total to around $7,100 "
        + "if you work the whole year.",
        16, "Yes, take the job offer", -15, 7100, 0,
        "No thank you. I should be focusing only on school right now.", 0, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "Your mother advises you to save 25% of your income every year for the rest of your life.", 16,
        "No, I'd rather spend my money and have fun", -10, 0, 0, "Yeah okay, that sounds like a great idea.", 0, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "A year has passed and you are planning to quit your part-time job. Do you want to buy a wallet for your pocket money? It will cost $20.",
        17,
        "Yes, I would like to. I gain $3 in income annually because I don't lose money anymore.",
        -20, -7097, 0, "No thanks, I have pockets. You drop $5 as you walk away.", 0, -7100, 5));
    this.scenarioRepository.save(new Scenario(
        "Oh no! You have been diagnosed with nearsightedness and you need 200$ to buy new glasses.",
        18, "Yes, buy the glasses", -200, 0, 0,
        "Don't buy the glasses, I'll just live in some discomfort.", 0, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "You have graduated from high school and have now decided to enroll in University. Tuition costs $9000 per year.",
        19, "Yes, I will go to university.", 0, 0, 9000,
        "No, I do not want to go to university.", 0, 0,
        0));
    this.scenarioRepository.save(new Scenario(
        "Due to your high achievements in high school, you have received a grant of $2000 for your univerity career.",
        19, "I will save this money for when I really need it later.", 2000, 0, 0,
        "Oh yeah! I'll use that money on a luxurious shopping spree at the mall!",
        0, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "University has turned out to be expensive. You are required to purchase textbooks for your courses this semester, "
        + "which total at around $200 from the bookstore.",
        19, "I will purchase brand-new textbooks. I want everything to be new.", 0, 0, 0,
        "I will purchase used textbooks that an upper-year friend is offering me, which will instead cost me $110.",
        -110, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "You have gotten stellar marks in one of your courses and have offered to be a Teaching Assistant for it, which will pay you $3,500 for a whole semester. However, you may have t"
        + "o drop a few courses and delay your graduation in order to work and study.",
        20, "I will take the TA offer and risk delaying my graduation.", 3500, 0, 0,
        "I will not accept the TA offer. I would much rather graduate on time and get a full-time job then.",
        0, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "Congratulations! You graduated and are currently deciding between 2 job offers: Job A pays $40k yearly and is conveniently near your parent's house! Job B pays"
            + " $75k yearly but the office is located far away and will require you to move ... rent in the area is about $2000 monthly ($24,000 yearly).",
        23, "I will take Job A, as I value being close to my family and friends.", 0, 40000, -9000,
        "I will take Job B, as I would like a high income and would be willing to start anew in an unfamiliar place.",
        0, 75000, 15000));
    this.scenarioRepository.save(new Scenario(
        "Your mother's birthday is coming up! She invites you home for the weekend, since it has been a while.",
        24, "I will purchase a gaudy $200 necklace for my mother. She deserves the best!.", -200,
        0, 0,
        "I will wish my mother a happy birthday, knowing my presence is already a gift to her.", 0,
        0, 0));
    this.scenarioRepository.save(new Scenario(
        "Welcome to your late-20's! You have invested some time in forming a relationship. You and your partner have decided to start saving money, but the question is, "
            + "will you save together, in a joint investment account?",
        27,
        "I want a joint account. I love my partner and we will save more money together - win win.",
        0, 10000, 0,
        "I would rather have separate investment accounts. I would much prefer separating my personal life from money matters.",
        0, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "COVID-19 has got you and your partner working from home. With all the free time you both have, you have begun discussing about the future. There is the "
            + "chance that you would like to start a family.",
        30,
        "I am open to starting a family, and am willing to endure the financial costs of raising a child.",
        0, 0, 0,
        "I don't think I would like to start a family. The cost of kids is a price I am not willing to pay yet.",
        0, 0, 0));
  }

}
