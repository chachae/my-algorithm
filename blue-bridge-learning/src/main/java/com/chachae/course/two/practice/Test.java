package com.chachae.course.two.practice;

/**
 * 使用递归输出1~10
 *
 * @author chachae
 * @since 2020/2/3 15:34
 */
public class Test {

  static int f(int n, int a) {
    System.out.print(a + " ");
    if (n == 1) {
      return 0;
    }
    return f(n - 1, a + 1);
  }

  public static void main(String[] args) {
    f(10, 1);
  }
}
