package com.example.demo.model;

public class Students2 {
  private int id;
  private String name;
  private int age;
  private String address;


  public Students2() {
  }

  public Students2(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", age='" + getAge() + "'" +
      ", address='" + getAddress() + "'" +
      "}";
  }


}


