package com.example.demo.model;

public class UserRequestModel {

  private String userName;
  private int userAge;
  private String userAddress;

  public UserRequestModel() {
  }

  public UserRequestModel(String userName, int userAge, String userAddress) {
    this.userName = userName;
    this.userAge = userAge;
    this.userAddress = userAddress;
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
