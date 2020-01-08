package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/"></a>
 *
 * @author chachae
 * @since 2020/1/7 15:51
 */
public class No0747 {

  @Test
  public void test() {

    int[] nums = new int[] {1};
    System.out.println(dominantIndex(nums));
  }

  public int dominantIndex(int[] nums) {
    int len = nums.length;
    if (len < 2) {
      return 0;
    }
    int[] copy = nums.clone();
    Arrays.sort(nums);
    if (nums[len - 1] < nums[len - 2] * 2) {
      return -1;
    } else {
      int k = 0;
      for (int i : copy) {
        if (i == nums[len - 1]) {
          return k;
        } else {
          k++;
        }
      }
    }
    return -1;
  }

  /**
   * Others solution
   *
   * @param nums int[]
   * @return int
   */
  public int dominantIndex2(int[] nums) {
    int max = 0, idx = 0, less = 1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        less = max;
        max = nums[i];
        idx = i;
      } else if (nums[i] > less) {
        less = nums[i];
      }
    }
    return max >= (less * 2) ? idx : -1;
  }
}
