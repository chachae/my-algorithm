package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/sort-array-by-parity/comments/"></a>
 *
 * @author chachae
 * @since 2020/1/5 16:25
 */
public class No0905 {

  public int[] sortArrayByParity(int[] A) {
    int len = A.length, f = 0, l = len - 1;
    int[] newData = new int[len];
    for (int value : A) {
      if (value % 2 == 0) {
        newData[f] = value;
        f++;
      } else {
        newData[l] = value;
        l--;
      }
    }
    return newData;
  }

  @Test
  public void test() {
    int[] nums = new int[] {4, 55, -4, 4, 4346, 46, 4, 35, 5, 345, 36, 1};
    System.out.println(Arrays.toString(sortArrayByParity(nums)));
  }
}
