package com.chachae.course.one.question5;

import java.util.Scanner;

/**
 * @author chachae
 * @since 2020/2/3 12:34
 */
public class Main {

  private static boolean validate(String code) {
    int sum = 0;
    for (int i = code.length() - 1; i >= 0; i--) {
      int res = Integer.parseInt(code.charAt(i) + "");
      if ((i + 1) % 2 == 0) {
        res = res * 2;
        res = res >= 10 ? res - 9 : res;
      }
      sum += res;
    }
    return sum % 10 == 0;
  }

  public static void main(String[] args) {
    if (validate(new Scanner(System.in).next())) {
      System.out.println("成功");
    } else {
      System.out.println("失败");
    }
  }
}
