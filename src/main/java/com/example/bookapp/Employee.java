package com.example.bookapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// definition of employee objects

@Entity
public class Employee {

  // attributes

  @Id
  @GeneratedValue
  private int id;
  private String fio;
  private String telephone;
  private String position;
  private String department;
  private Boolean authorization;
  private String emailId;

  //getters and setters

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFio() {
    return fio;
  }

  public void setFio(String fio) {
    this.fio = fio;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Boolean getAuthorization() {
    return authorization;
  }

  public void setAuthorization(Boolean authorization) {
    this.authorization = authorization;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }
}
