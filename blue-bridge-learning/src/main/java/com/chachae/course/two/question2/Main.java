package com.chachae.course.two.question2;

/**
 * @author chachae
 * @since 2020/2/3 15:44
 */
public class Main {
  static int count = 0;

  static void f(int left, int stop) {

    if (left == 0 && stop == 0) {
      count += 1;
      return;
    }

    if (left > 0) {
      f(left - 1, stop + 1);
    }

    if (stop > 0) {
      f(left, stop - 1);
    }
  }

  public static void main(String[] args) {
    f(16, 0);
    System.out.println(count);
  }
}
