package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author chachae
 * @since 2020/4/8 21:24
 */
public class No1365 {

  @Test
  public void test() {
    int[] arr = new int[] {3,432,432,35,345,43,34,4,45,64,645,634,634,643,63,46};
    System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
  }

  /**
   * nums = [8,1,2,2,3] 输出：[4,0,1,1,3]
   *
   * @param nums
   * @return
   */
  public int[] smallerNumbersThanCurrent(int[] nums) {

    int len = nums.length;

    int[] anl = new int[len];

    for (int i = 0; i < len; i++) {
      int count = 0;
      for (int j = 0; j < len; j++) {
        if (nums[j] < nums[i] && i != j) {
          count++;
        }
      }
      anl[i] = count;
    }

    return anl;
  }
}
