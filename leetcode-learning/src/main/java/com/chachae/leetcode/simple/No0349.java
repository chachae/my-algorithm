package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays/"></a>
 *
 * @author chachae
 * @since 2020/1/6 21:53
 */
public class No0349 {

  @Test
  public void test() {
    int[] nums1 = new int[] {4, 9, 5};
    int[] nums2 = new int[] {9, 4, 9, 8, 4};
    System.out.println(Arrays.toString(intersection2(nums1, nums2)));
    System.out.println(Arrays.toString(intersection(nums1, nums2)));
  }

  /**
   * My solution
   *
   * @param nums1 nums1
   * @param nums2 nums2
   * @return new nums
   */
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();
    int len1 = nums1.length;
    int len2 = nums2.length;
    if (len1 < len2) {
      for (int item : nums1) {
        for (int value : nums2) {
          if (item == value) {
            set.add(item);
          }
        }
      }
    } else {
      for (int item : nums2) {
        for (int value : nums1) {
          if (item == value) {
            set.add(item);
          }
        }
      }
    }
    int k = 0;
    int[] res = new int[set.size()];
    for (Integer e : set) {
      res[k] = e;
      k++;
    }
    return res;
  }

  /**
   * Others solution
   *
   * @param nums1 nums1
   * @param nums2 nums2
   * @return int[]
   */
  public int[] intersection2(int[] nums1, int[] nums2) {
    if (nums1.length == 0 || nums2.length == 0) {
      return new int[0];
    }
    boolean[] bool = new boolean[1200];
    for (int value : nums1) {
      bool[value] = true;
    }
    int k = 0;
    for (int value : nums2) {
      if (bool[value]) {
        nums1[k++] = value;
        bool[value] = false;
      }
    }
    int[] res = new int[k];
    System.arraycopy(nums1, 0, res, 0, k);
    return res;
  }
}
