package com.chachae.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <a href="http://lx.lanqiao.cn/problem.page?gpid=T201"></a>
 *
 * @author chachae
 * @since 2020/1/15 11:20
 */
public class Algo79 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int[] ns = new int[count];
    for (int i = 0; i < count; i++) {
      ns[i] = sc.nextInt();
    }

    List<Integer> res = dp(ns);
    int size = res.size();
    if (size > 0) {
      System.out.println(size);
      for (Integer n : res) {
        System.out.print(n + " ");
      }
    } else {
      System.out.println(0);
    }
  }

  static List<Integer> dp(int[] ns) {

    List<Integer> res = new ArrayList<>();

    for (int n : ns) {
      if (n != 0) {
        res.add(n);
      }
    }
    return res;
  }
}
