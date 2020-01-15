package com.chachae.course.four;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/1/15 16:50
 */
public class Example1 {

  @Test
  public void test() {

    double sum = 0;
    for (double i = 2; i <= 100; i++) {

      double c = 1 / i;
      sum += c;
    }

    System.out.println(sum);
  }
}
