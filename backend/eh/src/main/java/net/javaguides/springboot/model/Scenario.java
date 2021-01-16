package net.javaguides.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column; 

@Entity
@Table(name= "scenarios")
public class Scenario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY  )
  private long id;

  @Column(name = "description")
  private String description;

  @Column(name = "option1")
  private String option1;

  @Column(name = "option1savings")
  private int option1savings;

  @Column(name = "option1debt")
  private int option1debt;

  @Column(name = "option2")
  private String option2; 
  
  @Column(name = "option2savings")
  private int option2savings;

  @Column(name = "option2debt")
  private int option2debt;

  public Scenario( String description, String option1, int option1savings, int option1debt, String option2, int option2savings, int option2debt){
    this.description = description; 
    this.option1 = option1; 
    this.option1savings = option1savings; 
    this.option1debt = option1debt; 
    this.option2 = option2; 
    this.option2savings = option2savings; 
    this.option2debt = option2debt; 
  }
}
