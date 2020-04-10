package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/10 15:54
 */
public class No1385 {

  @Test
  public void test() {
    int[] a = new int[]{1,4,2,3};
    int[] b = new int[]{-4,-3,6,10,20,30};
    System.out.println(findTheDistanceValue(a, b, 3));
  }

  public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    int res = 0;
    for (int s : arr1) {
      int c = 0;
      for (int value : arr2) {
        if (Math.abs(s - value) > d) {
          c++;
        }
      }
      if (c == arr2.length) {
        res++;
      }
    }
    return res;
  }

}
