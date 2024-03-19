package ru.x5.techmin.less1;

public class OverValue {
  public static void main(String[] args) {
    int a = Integer.MAX_VALUE;
    System.out.println(a);
    a = a + 1;
    System.out.println(a);

    String s1 = "X5";
    String s2 = "X5";
    String s3 = "X5";
    String s4 = "X5";

    System.out.println(s1);
    s1 = s1 + "a";
  }
}
