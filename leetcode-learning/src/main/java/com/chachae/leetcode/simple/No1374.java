package com.chachae.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 *
 * @author chachae
 * @since 2020/4/20 20:50
 */
public class No1374 {

  public String generateTheString(int n) {
    StringBuilder res = new StringBuilder();
    if (n % 2 == 0) {
      for (int i = 0; i < (n - 1); i++) {
        res.append('a');
      }
      res.append('b');
    } else {
      for (int i = 0; i < n; i++) {
        res.append('a');
      }
    }
    return res.toString();
  }
}
