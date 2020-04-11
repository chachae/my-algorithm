package com.chachae.leetcode.interview;

import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 *
 * @author chachae
 * @since 2020/4/11 16:47
 */
public class Inv0058 {

  @Test
  public void test() {
    System.out.println(reverseLeftWords2("abcdefg", 2));
  }

  // lrloseumgh umghlrlose
  public String reverseLeftWords(String s, int n) {
    char[] chars = s.toCharArray();
    int sub = n;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= chars.length; i++) {
      if (sub != chars.length) {
        sb.append(chars[sub]);
        sub++;
      } else {
        sub = 0;
      }
    }
    return sb.toString();
  }

  public String reverseLeftWords2(String s, int n) {
    return s.substring(n) + s.substring(0, n);
  }
}
