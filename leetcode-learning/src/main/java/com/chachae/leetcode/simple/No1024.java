package com.chachae.leetcode.simple;

import java.util.Stack;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/12 15:48
 */
public class No1024 {

  @Test
  public void test() {
    System.out.println(removeOuterParentheses("(()())(())(()(()))"));
  }

  // for=10 (
  // ()()
  public String removeOuterParentheses(String S) {
    StringBuilder res = new StringBuilder();
    char front = '(';
    Stack<Character> stack = new Stack<>();
    char[] chars = S.toCharArray();
    for (char e : chars) {
      if (e == front) {
        // 判断栈是否为空
        if (!stack.isEmpty()) {
          res.append(e);
        }
        stack.push(e);
      } else {
        if (!stack.isEmpty() && stack.size() != 1) {
          res.append(e);
        }
        stack.pop();
      }
    }
    return res.toString();
  }

  // (()())(())(()(()))
  public String removeOuterParentheses2(String S) {
    StringBuilder sb = new StringBuilder();
    int level = 0;
    for (char c : S.toCharArray()) {
      if (c == ')') {
        level--;
      }
      if (level >= 1) {
        sb.append(c);
      }
      if (c == '(') {
        level++;
      }
    }
    return sb.toString();
  }
}
