package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author chachae
 * @since 2020/4/8 23:03
 */
public class No1333 {

  @Test
  public void test() {
    int[] n = new int[] {1, 1, 2, 3};
    System.out.println(Arrays.toString(decompressRLElist(n)));
  }

  /** 1 2 3 4 5 6 7 8 1 1 1 1 1 1 1 1 */
  public int[] decompressRLElist(int[] nums) {
    int len = 0;
    for (int i = 0; i < nums.length; i += 2) {
      len += nums[i];
    }
    int[] res = new int[len];
    int index = 0;
    for (int i = 0; i < nums.length; i += 2) {
      while (nums[i] > 0) {
        res[index] = nums[i + 1];
        nums[i]--;
        index++;
      }
    }
    return res;
  }
}
