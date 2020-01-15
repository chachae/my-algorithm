package com.chachae.practice;

import java.util.Scanner;

/**
 * <a href="http://lx.lanqiao.cn/problem.page?gpid=T560"></a>
 *
 * @author chachae
 * @since 2020/1/15 11:06
 */
public class Algo217 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int[] score = new int[count];
    for (int i = 0; i < count; i++) {
      score[i] = sc.nextInt();
    }

    int[] ne = dp(score);
    for (int i : ne) {
      System.out.print(i + " ");
    }
  }

  static int[] dp(int[] ns) {
    for (int i = 0; i < ns.length; i++) {
      for (int j = 0; j < ns.length - i - 1; j++) {
        if (ns[j] < ns[j + 1]) {
          int k = ns[j];
          ns[j] = ns[j + 1];
          ns[j + 1] = k;
        }
      }
    }
    return ns;
  }
}
