package com.example.demo.model;

public class Students {
  private int id;
  private String userName;
  private int userAge;
  private String userAddress;

  public Students() {
  }

  public Students(String userName, int userAge, String userAddress) {
    this.id = 0;
    this.userName = userName;
    this.userAge = userAge;
    this.userAddress = userAddress;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getUserAge() {
    return this.userAge;
  }

  public void setUserAge(int userAge) {
    this.userAge = userAge;
  }

  public String getUserAddress() {
    return this.userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }


  

}






