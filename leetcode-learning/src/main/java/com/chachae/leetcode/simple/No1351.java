package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix/
 *
 * @author chachae
 * @since 2020/4/10 22:22
 */
public class No1351 {

  @Test
  public void test() {
    int[][] n = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
    System.out.println(countNegatives(n));
  }


  public int countNegatives(int[][] grid) {
    int count = 0;
    for (int[] ints : grid) {
      for (int cur : ints) {
        count = cur < 0 ? count + 1 : count;
      }
    }
    return count;
  }
}
