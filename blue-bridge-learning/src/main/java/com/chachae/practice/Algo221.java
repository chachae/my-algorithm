package com.chachae.practice;

import java.util.Scanner;

/**
 * <a href="http://lx.lanqiao.cn/problem.page?gpid=T566"></a>
 *
 * @author chachae
 * @since 2020/1/15 10:56
 */
public class Algo221 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] ns = new int[2];
    for (int i = 0; i < 2; i++) {
      ns[i] = sc.nextInt();
    }
    int[] ne = swap(ns);
    for (int n : ne) {
      System.out.print(n + " ");
    }
  }

  static int[] swap(int[] ns) {
    int a = ns[0];
    ns[0] = ns[1];
    ns[1] = a;
    return ns;
  }
}
