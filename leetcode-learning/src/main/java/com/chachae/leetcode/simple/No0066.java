package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/plus-one/submissions/"></a>
 *
 * @author chachae
 * @since 2020/1/7 15:21
 */
public class No0066 {

  @Test
  public void test() {
    int[] dig = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 7, 9, 9, 8, 9};
    System.out.println(Arrays.toString(plusOne(dig)));
  }

  public int[] plusOne(int[] digits) {
    int len = digits.length;
    for (int i = len - 1; i >= 0; i--) {
      if (digits[i] != 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }
    int[] temp = new int[len + 1];
    temp[0] = 1;
    return temp;
  }
}
