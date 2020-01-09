package com.chachae.course.two;

import org.junit.jupiter.api.Test;

/**
 * 递归
 *
 * @author chachae
 * @since 2020/1/9 16:52
 */
public class Example1 {

  public void ts1(int a, int b) {
    if (a < b) {
      ts1(a, b - 1);
    }
    System.out.println(b);
  }

  public String ts2(String s) {
    if (s.length() <= 1) {
      return s;
    }
    return ts2(s.substring(1)) + s.charAt(0);
  }

  @Test
  public void test() {
    // ts1(1, 10);
    System.out.println(ts2("abcde"));
  }
}
