package com.chachae.leetcode.medium;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/2/4 14:14
 */
public class No0008 {

  @Test
  public void test() {
    String str = "-91283472332";
    System.out.println(myAtoi(str));
  }

  public int myAtoi(String str) {
    if (str == null || str.length() == 0) {
      return 0;
    }
    int sign = 1;
    int i = 0;
    int len = str.length();
    while (i < len && str.charAt(i) == ' ') {
      i++;
    }
    if (i >= len) {
      return 0;
    }
    StringBuilder s = new StringBuilder();
    if (str.charAt(i) == '-') {
      sign = 0;
      i++;
    } else if (str.charAt(i) == '+') {
      i++;
    }
    if (i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
      while (i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        s.append(str.charAt(i));
        i++;
      }
    } else {
      return 0;
    }
    try {
      int x = Integer.parseInt(s.toString());
      if (sign > 0) {
        return x;
      } else {
        return -x;
      }
    } catch (NumberFormatException e) {
      if (sign > 0) {
        return Integer.MAX_VALUE;
      } else {
        return Integer.MIN_VALUE;
      }
    }
  }
}
