package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
 *
 * @author chachae
 * @since 2020/4/13 14:24
 */
public class No0852 {

  @Test
  public void test() {
    System.out.println(peakIndexInMountainArray(new int[]{0,  1, 0}));
  }


  public int peakIndexInMountainArray(int[] A) {
    return search(1, A);
  }

  private int search(int index, int[] nums) {
    if (index == nums.length) {
      return -1;
    }
    if (nums[index] > nums[index - 1] && nums[index] > nums[index + 1]) {
      return index;
    } else {
      return search(index + 1, nums);
    }
  }
}
