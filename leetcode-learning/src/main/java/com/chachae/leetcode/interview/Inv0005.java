package com.chachae.leetcode.interview;

import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 *
 * @author chachae
 * @since 2020/4/12 18:29
 */
public class Inv0005 {


  @Test
  public void test() {
    System.out.println(replaceSpace("We are happy."));
  }

  public String replaceSpace(String s) {
    StringBuilder res = new StringBuilder();
    char[] chars = s.toCharArray();
    for (char e : chars) {
      if (e == ' ') {
        res.append("%20");
      } else {
        res.append(e);
      }
    }
    return res.toString();
  }
}
