
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
        "Your friends want you to buy them ice cream. It will cost you 10$ at McDonald's.", 16,
        "Yes, buy the icecream", -10, 0, 0, "No, save my money", 0, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "You are offered a part-time job at the local McDonald's. It will cost you $15 for the uniform, but you will make about $170 weekly if you work for just 2 days. This will total to around $7,100 if you work the whole year.",
        16, "Yes, take the job offer", -15, 7100, 0,
        "No thank you. I should be focusing only on school right now.", 0, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "A year has passed and you have quit your part-time job. Do you want to buy a wallet for your pocket money? It will cost $20",
        17,
        "Yes, I would like to. I gain $3 in income annually because I don't lose money anymore.",
        -20, 0, 3, "No thanks, I have pockets. You drop $5 as you walk away.", 0, 5, 0));
    this.scenarioRepository.save(new Scenario(
        "Oh no! You have been diagnosed with nearsightedness and you need 200$ to buy new glasses.",
        18, "Yes, buy the glasses", -200, 0, 0,
        "Don't buy the glasses, I'll just live in some discomfort.", 0, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "You have graduated from high school and have now decided to enroll in a post-secondary institution. From your most recent appointment at the bank, you are encouraged to get a credit card.",
        19, "Yes, I will get a credit card.", 0, 0, 0,
        "No, I do not need a credit card at the moment. I will get one later when I need it.", 0, 0,
        0));
    this.scenarioRepository.save(new Scenario(
        "Remember that getting a credit card early is highly encouraged. You will be able to build your credit score up in time to be able to be approved for a mortage, should you decide to buy a home in the future. \n"
            + "University has turned out to be expensive. You are required to purchase textbooks for your courses this semester, which total at around $200 from the bookstore.",
        19, "I will purchase brand-new textbooks. I want everything to be new.", 0, 0, 0,
        "I will purchase used textbooks that an upper-year friend is offering me, which will instead cost me $110.",
        -200, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "You have gotten stellar marks in one of your courses and have offered to be a Teaching Assistant for it, which will pay you $3,500 for a whole semester. However, taking a full course load and working"
            + "has proven to be difficult, so you may have to drop a few courses and delay your graduation in order to work.",
        20, "I will take the TA offer and risk delaying my graduation.", 0, 3500, 0,
        "I will not accept the TA offer. I would much rather graduate on time and get a full-time job then.",
        0, 0, 0));
    this.scenarioRepository.save(new Scenario(
        "Congratulations! You have graduated and are off to the job industry! You currently have two job offers and need to decide which one to take: Job A pays $75,000 yearly, and is very conveniently near your area! Job B pays"
            + "$100 000 yearly, however the office is located in a completely different province and will require you to move.",
        23, "I will take Job A, as I value being close to my family and friends.", 0, 70000, 0,
        "I will take Job B, as I would like a high income and would be willing to start anew in an unfamiliar place.",
        0, 100000, 0));
    this.scenarioRepository.save(new Scenario(
        "You are now an adult, living on your own. Based on our stats, you will pay an average $1700 on monthly rent.\n"
            + "Your mother's birthday is coming up! She invites you home for the weekend, since it has been a while.",
        24, "I will purchase a gaudy $200 necklace for my mother. She deserves the best!.", 0,
        210000, 1900,
        "I will wish my mother a happy birthday, knowing my presence is already a gift to her.", 0,
        0, 1700));
    this.scenarioRepository.save(new Scenario(
        "Welcome to your late-20's! Many changes are happening at this time; You have invested some time in forming a relationship, "
            + "and it looks like there is news of an outbreak happening on the other side of the world. This has got you and your partner thinking about "
            + "saving up some money for the future. You and your partner have decided to start saving money, the question is, in a joint investment account?",
        27,
        "I want a joint account. I love my partner and we will save more money together - win win.",
        32000, 210000, 1700,
        "I would rather have separate investment accounts. I would much prefer separating my personal life from money matters.",
        16000, 0, -1700));
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
