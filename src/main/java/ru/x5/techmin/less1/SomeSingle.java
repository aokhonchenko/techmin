package ru.x5.techmin.less1;

public class SomeSingle {

  private static SomeSingle instance = null;

  private SomeSingle() {
    System.out.println("И только тут я подключился к БД");
  }

  public static synchronized SomeSingle getInstance() {

    if (instance == null) {
      instance = new SomeSingle();
      return instance;
    }
    return instance;
  }

  public void methodA() {
    // ignore
  }
}
