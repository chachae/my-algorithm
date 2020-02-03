package com.chachae.course.two.question1;

/**
 * 37 -> 39 && 38 -> 39 以此类推
 *
 * @author chachae
 * @since 2020/2/3 15:01
 */
public class Main {

  static int f(int num, int step) {

    if (num == 0 && step % 2 == 0) {
      return 1;
    }

    if (num < 0) {
      return 0;
    }

    return f(num - 1, step + 1) + f(num - 2, step + 1);
  }

  public static void main(String[] args) {
    System.out.println(f(39, 0));
  }
}
