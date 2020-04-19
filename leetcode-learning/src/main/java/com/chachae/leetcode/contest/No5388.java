package com.chachae.leetcode.contest;

import java.util.Stack;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/contest/weekly-contest-185/problems/reformat-the-string/
 *
 * @author chachae
 * @since 2020/4/19 10:53
 */
public class No5388 {

  @Test
  public void test() {
    System.out.println(reformat("covid2019"));
  }

  public String reformat(String s) {
    if (s.length() == 1) {
      return s;
    }
    Stack<Character> word = new Stack<>();
    Stack<Character> num = new Stack<>();
    char[] chars = s.toCharArray();
    for (char n : chars) {
      if ((n) >= 97 && (n) <= 122) {
        word.push(n);
      } else {
        num.push(n);
      }
    }

    StringBuilder res = new StringBuilder();
    if (word.isEmpty() || num.isEmpty() || Math.abs(word.size() - num.size()) > 1) {
      return "";
    } else {
      if (num.size() <= word.size()) {
        while (!word.isEmpty()) {
          res.append(word.pop());
          if (!num.isEmpty()) {
            res.append(num.pop());
          }
        }
      } else {
        while (!num.isEmpty()) {
          res.append(num.pop());
          if (!word.isEmpty()) {
            res.append(word.pop());
          }
        }
      }
    }

    return res.toString();
  }
}
