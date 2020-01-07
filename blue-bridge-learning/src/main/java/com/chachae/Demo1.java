package com.chachae;

/**
 * @author chachae
 * @since 2020/1/6 22:45
 */
public class Demo1 {

  // 1 1    2 3   3 6   4 10
  public static void main(String[] args) {
    int sum = 0;
    int tmp = 0;
    for (int i = 1; i <= 100; i++) {
      tmp += i;
      sum += tmp;
    }
    System.out.println(sum);
  }
}
