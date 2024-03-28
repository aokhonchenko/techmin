package ru.x5.techmin.less2;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

public class Circles {

  public static void main(String[] args) {

    //        for (int i = 100; i > 1; i--) {
    //          System.out.println(i);
    //        }

    //        int y = 110;
    //
    //        do {
    //          System.out.println(y);
    //          y++;
    //        } while (y < 100);

    //    int z = 0;
    //    while (z < 100) {
    //      System.out.println(z++);
    //    }

    //    List<String> s = List.of("a", ":b", "dywduw");
    //    for (String sval : s) {
    //      System.out.println(sval);
    //    }
    //    System.out.println(s);

    LocalDateTime  start = LocalDateTime.now();
    IntStream.range(0, 100).forEach(System.out::println);
    System.out.println(start);
    System.out.println(LocalDateTime.now());

  }

}
