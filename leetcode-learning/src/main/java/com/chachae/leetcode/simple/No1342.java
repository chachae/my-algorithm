package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/12 18:16
 */
public class No1342 {

  @Test
  public void test() {
    System.out.println(numberOfSteps(14));
  }

  public int numberOfSteps(int num) {
    if (num == 1) {
      return 1;
    }

    if (num % 2 == 0) {
      return 1 + numberOfSteps(num / 2);
    } else {
      return 1 + numberOfSteps(num - 1);
    }
  }
}
