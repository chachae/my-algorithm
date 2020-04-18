package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 *
 * @author chachae
 * @since 2020/4/18 22:20
 */
public class No1309 {

  @Test
  public void test() {
    String s = "10#11#12";
    System.out.println(freqAlphabets(s));
  }

  public String freqAlphabets(String s) {
    char[] chars = s.toCharArray();
    char[] map = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
        'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    int length = chars.length;
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < length; i++) {
      // >9
      if ((i + 2) < length && chars[i + 2] == '#') {
        res.append(map[(chars[i] - 48) * 10 + (chars[i + 1] - 48) - 1]);
        i += 2;
      } else {
        res.append(map[(chars[i] - 48) - 1]);
      }
    }
    return res.toString();
  }
}
