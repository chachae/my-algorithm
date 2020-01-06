package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/valid-parentheses/"></a>
 *
 * @author chachae
 * @since 2020/1/6 11:33
 */
public class No0020 {

  public boolean isValid(String s) {
    if (s.length() % 2 != 0) {
      return false;
    }
    Map<Character, Character> map = new HashMap<>();
    map.put(')', '(');
    map.put(']', '[');
    map.put('}', '{');
    Stack<Character> stack = new Stack<>();
    char[] chars = s.toCharArray();
    if (s.length() > 0) {
      for (char a : chars) {
        if (a == '(' || a == '[' || a == '{') {
          stack.push(a);
        } else {
          if (stack.isEmpty()) {
            return false;
          }
          Character popChar = stack.peek();
          if (map.get(a).equals(popChar)) {
            stack.pop();
          } else {
            return false;
          }
        }
      }
    }
    return stack.isEmpty();
  }

  @Test
  public void test() {
    System.out.println(isValid(""));
  }
}
