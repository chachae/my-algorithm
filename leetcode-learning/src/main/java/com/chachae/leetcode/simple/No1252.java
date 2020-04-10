package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/10 17:59
 */
public class No1252 {

  @Test
  public void test() {
    System.out.println(oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));
  }

  // n=2 m=3

  public int oddCells(int n, int m, int[][] indices) {
    int[][] board = new int[n][m];
    for (int[] cur : indices) {
      // n=2
      for (int j = 0; j < n; j++) {
        board[j][cur[1]]++;
      }
      //m=3
      for (int j = 0; j < m; j++) {
        board[cur[0]][j]++;
      }
    }

    int p = 0;
    for (int[] ints : board) {
      for (int c : ints) {
        if (c % 2 != 0) {
          p++;
        }
      }
    }
    return p;
  }
}
