package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/hamming-distance/submissions/
 *
 * @author chachae
 * @since 2020/4/20 18:31
 */
public class No0461 {

  @Test
  public void test() {
    System.out.println(hammingDistance(8, 1));
  }

  public int hammingDistance(int x, int y) {
    return Integer.bitCount(x ^ y);
  }
}