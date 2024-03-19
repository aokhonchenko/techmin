package ru.x5.techmin.less1;

public class StatEx {

  public static int a = 8;

  public static void main(String[] args) {
    StatEx ex1 = new StatEx();
    StatEx ex2 = new StatEx();

    System.out.println(ex1.a); // 8

    ex2.a = 10;
    System.out.println(ex1.a); // 10

    StatEx.a = 12;
    System.out.println(ex1.a);
    System.out.println(StatEx.a);
  }
}
