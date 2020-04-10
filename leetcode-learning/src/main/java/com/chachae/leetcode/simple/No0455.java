package com.chachae.leetcode.simple;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/10 15:20
 */
public class No0455 {

  @Test
  public void test() {
    System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
  }

  /*

  1 2 3
  1 1

   */
  public int findContentChildren(int[] g, int[] s) {
    int child = 0;
    int ck = 0;
    Arrays.sort(g);
    Arrays.sort(s);

    while (child < g.length && ck < s.length) {
      if (g[child] <= s[ck]) {
        child++;
      }
      ck++;
    }
    return child;
  }
}
