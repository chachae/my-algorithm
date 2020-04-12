package com.chachae.leetcode.interview;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/submissions/
 *
 * @author chachae
 * @since 2020/4/12 18:21
 */
public class Inv0017 {

  @Test
  public void test() {
    System.out.println(Arrays.toString(printNumbers(1)));
  }

  public int[] printNumbers(int n) {

    int len = 0;
    for (int i = 0; i < n; i++) {
      len += 9 * Math.pow(10, i);
    }

    int[] res = new int[len];

    for (int i = 1; i <= len; i++) {
      res[i - 1] = i;
    }
    return res;
  }
}
