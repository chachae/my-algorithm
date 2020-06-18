package com.chachae.leetcode.simple;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/6/18 17:56
 */
public class No0283 {

  public void moveZeroes(int[] nums) {

    // int[] n = {0, 1, 0, 3, 12};
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      int temp = nums[i];
      nums[i] = 0;
      if (temp != 0) {
        nums[k] = temp;
        k++;
      }
    }
  }

  public static void main(String[] args) {
    int[] n = {0, 1, 0, 3, 12};
    new No0283().moveZeroes(n);
    System.out.println(Arrays.toString(n));
  }

}
