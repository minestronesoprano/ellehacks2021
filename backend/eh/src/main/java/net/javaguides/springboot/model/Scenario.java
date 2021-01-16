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

  //indicates an addition to the person's regular month income
  @Column(name = "option1income")
  private int option1income; 

  //indicates a increase of the person's regular month expenses
  @Column(name = "option1expenses")
  private int option1expenses;

  @Column(name = "option2")
  private String option2; 
  
  @Column(name = "option2savings")
  private int option2savings;

  @Column(name = "option2debt")
  private int option2debt;

  //indicates an addition to the person's regular month income
  @Column(name = "option2income")
  private int option2income; 

  //indicates a increase of the person's regular month expenses
  @Column(name = "option2expenses")
  private int option2expenses;

  public Scenario(){
    this.description = "description"; 

    this.option1 = "option1"; 
    this.option1savings = 0; 
    this.option1debt = 0; 
    this.option1income = 0; 
    this.option1expenses = 0; 

    this.option2 = "option2"; 
    this.option2savings = 0; 
    this.option2debt = 0; 
    this.option2income = 0; 
    this.option2expenses = 0;
  }

  public Scenario( String description, String option1, int option1savings, int option1debt, int option1income, 
  int option1expense, String option2, int option2savings, int option2debt, int option2income, int option2expenses){
    this.description = description; 

    this.option1 = option1; 
    this.option1savings = option1savings; 
    this.option1debt = option1debt; 
    this.option1income = option1income; 
    this.option1expense = option1expense; 

    this.option2 = option2; 
    this.option2savings = option2savings; 
    this.option2debt = option2debt; 
    this.option2income = option2income; 
    this.option2expense = option2expense;
  }
}
