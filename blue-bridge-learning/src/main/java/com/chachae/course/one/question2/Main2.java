package com.chachae.course.one.question2;

/**
 * @author chachae
 * @since 2020/2/3 11:37
 */
public class Main2 {

  public static int romeNum(String s) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == 'I') {
        sum += 1;
      }
      if (c == 'V') {
        sum += 5;
      }
      if (c == 'X') {
        sum += 10;
      }
      if (c == 'L') {
        sum += 50;
      }
      if (c == 'C') {
        sum += 100;
      }
      if (c == 'D') {
        sum += 500;
      }
      if (c == 'M') {
        sum += 1000;
      }
    }
    if (s.contains("IV")) {
      sum -= 2;
    }
    if (s.contains("IX")) {
      sum -= 2;
    }
    if (s.contains("XL")) {
      sum -= 20;
    }
    if (s.contains("XC")) {
      sum -= 20;
    }
    if (s.contains("CD")) {
      sum -= 200;
    }
    if (s.contains("CM")) {
      sum -= 200;
    }

    return sum;
  }

  public static void main(String[] args) {
    System.out.println(romeNum("MCCCXIV"));
    System.out.println(romeNum("CMXCIX"));
  }
}
