package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * <a
 * href="https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero/submissions/"></a>
 *
 * @author chachae
 * @since 2020/1/9 22:17
 */
public class No1304 {

  @Test
  public void test() {
    int n = 1;
    System.out.println(Arrays.toString(sumZero(n)));
  }

  public int[] sumZero(int n) {
    int[] res = new int[n];
    int h = 0, t = 0, l = n - 1;
    for (int i = 0; i < n / 2; i++) {
      res[i] = h + 1;
      res[l] = t - 1;
      t--;
      h++;
      l--;
    }
    return res;
  }
}
