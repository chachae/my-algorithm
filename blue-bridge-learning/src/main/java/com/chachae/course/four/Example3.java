package com.chachae.course.four;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/1/15 17:52
 */
public class Example3 {

  @Test
  public void test() {

    for (int i = 0; i < 1000; i++) {
      for (int j = 0; j < 1000; j++) {
        if (i * 97 - j * 127 == 1) {
          System.out.println(i + " " + j + " " + (i + j));
        }
      }
    }
  }
}
