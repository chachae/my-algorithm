package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits
 *
 * @author chachae
 * @since 2020/1/4 22:53
 */
public class No1295 {

  public int findNumbers(int[] nums) {
    int len = nums.length;
    int count = 0;
    if (len > 0) {
      for (int num : nums) {
        if (String.valueOf(num).length() % 2 == 0) {
          count++;
        }
      }
    }
    return count;
  }

  @Test
  public void test() {
    int[] nums = {555, 901, 482, 1771};
    System.out.println(findNumbers(nums));
  }
}
