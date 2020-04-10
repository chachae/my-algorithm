package com.chachae.leetcode.medium;

import java.util.Stack;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string/
 *
 * @author chachae
 * @since 2020/4/10 21:40
 */
public class No0151 {

  @Test
  public void test() {
    System.out.println(reverseWords("a "));
  }


  /**
   * 输入: "the sky is blue" 输出: "blue is sky the" \
   */
  public String reverseWords(String s) {

    Stack<String> stack = new Stack<>();
    char[] chars = s.trim().toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < chars.length; i++) {
      if (i == chars.length - 1) {
        sb.append(chars[i]);
        stack.add(sb.toString());
      } else if (chars[i] != ' ') {
        sb.append(chars[i]);
        // fix "a good   example"
      } else if (chars[i] == ' ') {
        if (chars[i + 1] == ' ') {
          continue;
        }
        stack.add(sb.toString());
        sb = new StringBuilder();
      }
    }
    int size = stack.size();
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < size; i++) {
      if (i == 0) {
        if (size == 1) {
          res.append(stack.pop());
        } else {
          res.append(stack.pop()).append(' ');
        }
      } else if (i != size - 1) {
        res.append(stack.pop()).append(' ');
      } else {
        res.append(stack.pop());
      }
    }
    return res.toString();
  }

}
