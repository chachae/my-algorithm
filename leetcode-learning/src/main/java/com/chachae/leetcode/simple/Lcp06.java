package com.chachae.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/na-ying-bi/
 *
 * @author chachae
 * @since 2020/4/19 10:39
 */
public class Lcp06 {

  public int minCount(int[] coins) {
    int sum = 0;
    for (int e : coins) {
      sum += (e / 2) + 1;
    }
    return sum;
  }
}
