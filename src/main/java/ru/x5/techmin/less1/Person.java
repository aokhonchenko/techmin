package ru.x5.techmin.less1;

public class Person {

  public static String type = "млек";

  public String passport = "1234";
  public String name = "";

  public Person() {}

  public Person(String name) {
    this(name, null);
  }

  public Person(String name, String passport) {
    this.name = name;
    this.passport = passport;
  }
}
