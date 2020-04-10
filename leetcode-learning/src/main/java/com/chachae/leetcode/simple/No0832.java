package com.chachae.leetcode.simple;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/10 18:30
 */
public class No0832 {

  @Test
  public void test() {
    int[][] n = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
    int[][] ints = flipAndInvertImage(n);
    for (int[] cur : ints) {
      System.out.println(Arrays.toString(cur));
    }
  }

  public int[][] flipAndInvertImage(int[][] A) {
    for (int[] ints : A) {
      int len = ints.length;
      int tail = len - 1;
      for (int i = 0; i < len / 2; i++) {
        int temp = ints[tail];
        ints[tail] = ints[i] == 0 ? 1 : 0;
        ints[i] = temp == 0 ? 1 : 0;
        tail--;
      }

      if (len % 2 != 0) {
        ints[len / 2] = ints[len / 2] == 0 ? 1 : 0;
      }
    }
    return A;
  }
}
