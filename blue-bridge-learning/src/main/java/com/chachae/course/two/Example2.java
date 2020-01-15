package com.chachae.course.two;

import org.junit.jupiter.api.Test;

/*
 * 第39级台阶
 * 小明刚刚看完电影《第39级台阶》，离开电影院的时候，他数了数礼堂前的台阶数，恰好是39级!
 * 站在台阶前，他突然又想着一个问题：
 * 如果我每一步只能迈上1个或2个台阶。
 * 先迈左脚，然后左右交替，最后一步是迈右脚，也就是说一共要走偶数步。
 * 那么，上完39级台阶，有多少种不同的上法呢？
 * 请你利用计算机的优势，帮助小明寻找答案。
 * @author chachae
 * @since 2020/1/14 22:32
 */
public class Example2 {

  @Test
  public void test() {

    int[][] b = new int[39][2];

    b[0][0] = 1;
    b[0][1] = 0;
    b[1][0] = 1;
    b[1][1] = 1;

    for (int i = 2; i < 39; i++) {

      b[i][0] = b[i - 1][1] + b[i - 2][1];
      b[i][1] = b[i - 1][0] + b[i - 2][0];
    }

    System.out.println(b[38][1]);
  }
}
