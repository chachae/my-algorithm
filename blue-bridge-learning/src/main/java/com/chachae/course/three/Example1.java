package com.chachae.course.three;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chachae
 * @since 2020/1/15 13:59
 */
public class Example1 {

  List<String> f(String s) {
    List<String> lst = new ArrayList<>();

    int len = s.length();

    if (len == 1) {
      lst.add(s);
      return lst;
    }

    for (int i = 0; i < len; i++) {

      char head = s.charAt(i);

      List<String> t = f(s.substring(0, i) + s.substring(i + 1));
      for (String n : t) {
        lst.add("" + head + n);
      }
    }
    return lst;
  }

  @Test
  public void test() {

    String str = "ABC";
    List<String> list = f(str);
    for (String s : list) {
      System.out.println(s);
    }
  }
}
