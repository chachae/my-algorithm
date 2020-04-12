package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/maximum-69-number/
 *
 * @author chachae
 * @since 2020/4/12 18:33
 */
public class No1323 {

  @Test
  public void test() {
    System.out.println(maximum69Number(6669969));
  }


  public int maximum69Number(int num) {
    String str = String.valueOf(num);
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '6') {
        res.append('9').append(str, i + 1, str.length());
        break;
      } else {
        res.append('9');
      }
    }
    return Integer.parseInt(res.toString());
  }
}
