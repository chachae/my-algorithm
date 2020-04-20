package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/to-lower-case/
 *
 * @author chachae
 * @since 2020/4/20 18:18
 */
public class No0709 {

  @Test
  public void test() {
    System.out.println(toLowerCase("Here"));
  }

  public String toLowerCase(String str) {
    StringBuilder res = new StringBuilder();
    char[] chars = str.toCharArray();
    for (char e : chars) {
      if (e >= 65 && e <= 90) {
        res.append((char) (e + 32));
      } else {
        res.append(e);
      }
    }
    return res.toString();
  }
}
