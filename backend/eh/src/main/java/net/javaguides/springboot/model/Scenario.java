package net.javaguides.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "scenarios")
public class Scenario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "description")
  private String description;
  
  @Column(name = "age")
  private int age;

  @Column(name = "option1")
  private String option1;

  @Column(name = "option1savings")
  private int option1savings;

  // indicates an addition to the person's regular month income
  @Column(name = "option1income")
  private int option1income;


  // indicates a increase of the person's regular month expenses
  @Column(name = "option1expenses")
  private int option1expenses;

  @Column(name = "option2")
  private String option2;

  @Column(name = "option2savings")
  private int option2savings;

  // indicates an addition to the person's regular month income
  @Column(name = "option2income")
  private int option2income;


  // indicates a increase of the person's regular month expenses
  @Column(name = "option2expenses")
  private int option2expenses;


  public Scenario() {

  }

  public Scenario(String description, int age, String option1, int option1savings, int option1income,
      int option1expenses, String option2, int option2savings, int option2income,
      int option2expenses) {
    this.setDescription(description);
    this.setAge(age);
    this.setOption1(option1);
    this.setOption1savings(option1savings);
    this.setOption1income(option1income);
    this.setOption1expenses(option1expenses);
    this.setOption2(option2);
    this.setOption2savings(option2savings);
    this.setOption2income(option2income);
    this.setOption2expenses(option2expenses);
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getOption1() {
    return option1;
  }

  public void setOption1(String option1) {
    this.option1 = option1;
  }

  public int getOption1savings() {
    return option1savings;
  }

  public void setOption1savings(int option1savings) {
    this.option1savings = option1savings;
  }

  public String getOption2() {
    return option2;
  }

  public void setOption2(String option2) {
    this.option2 = option2;
  }

  public int getOption2savings() {
    return option2savings;
  }

  public void setOption2savings(int option2savings) {
    this.option2savings = option2savings;
  }

  public int getOption1income() {
    return option1income;
  }

  public void setOption1income(int option1income) {
    this.option1income = option1income;
  }

  public int getOption1expenses() {
    return option1expenses;
  }

  public void setOption1expenses(int option1expenses) {
    this.option1expenses = option1expenses;
  }

  public int getOption2income() {
    return option2income;
  }

  public void setOption2income(int option2income) {
    this.option2income = option2income;
  }

  public int getOption2expenses() {
    return option2expenses;
  }

  public void setOption2expenses(int option2expenses) {
    this.option2expenses = option2expenses;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
