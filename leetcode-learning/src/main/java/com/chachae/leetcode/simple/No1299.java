package com.chachae.leetcode.simple;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/10 16:05
 */
public class No1299 {

  @Test
  public void test() {
    int[] n = new int[]{1, 2, 5, 4, 1};
    System.out.println(Arrays.toString(replaceElements(n)));
  }

  /**
   * arr: 17 18 5 4 6 1
   * new: 18 6 6 6 1 -1
   * <p>
   * 1 2 3 5 4 6 1 1 2 3 5 6 1 -1 1 6 6 6 6 1 -1
   * <p>
   * 18,6,6,6,1,-1 old: 17 18 5 4 6 1 arr: 1 4 5 6 17 18
   */
  public int[] replaceElements(int[] arr) {
    int max = -1;
    for (int i = arr.length - 1; i >= 0; i--) {
      int temp = arr[i];
      arr[i] = max;
      if (max < temp) {
        max = temp;
      }
    }
    return arr;
  }
}
