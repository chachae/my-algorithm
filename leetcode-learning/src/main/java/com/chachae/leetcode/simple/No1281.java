package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 *
 * @author chachae
 * @since 2020/1/4 22:21
 */
public class No1281 {

  public int other(int n) {
    int muti = 1;
    int sum = 0;
    while (n != 0) {
      muti *= n % 10;
      sum += n % 10;
      n /= 10;
    }
    return muti - sum;
  }

  public int subtractProductAndSum(int n) {
    int sum = 0, x = 1;
    String exc = "0";
    String str = String.valueOf(n);
    int len = str.length();
    if (str.contains(exc)) {
      x = 0;
      for (int i = 0; i < len; i++) {
        sum += Integer.parseInt(str.charAt(i) + "");
      }
    } else {
      for (int i = 0; i < len; i++) {
        int a = Integer.parseInt(str.charAt(i) + "");
        sum += a;
        x *= a;
      }
    }
    return x - sum;
  }

  @Test
  public void test() {
    System.out.println(subtractProductAndSum(999099));
  }
}
