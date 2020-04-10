package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/10 15:41
 */
public class No1266 {

  @Test
  public void test() {
    System.out.println(minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));
  }

  public int minTimeToVisitAllPoints(int[][] points) {
    int len = points.length;
    int res = 0;
    for (int i = 0; i < (len - 1); i++) {
      res = Math.max(Math.abs(points[i][0] - points[i + 1][0]),
          Math.abs(points[i][1] - points[i + 1][1]));
    }
    return res;
  }
}
