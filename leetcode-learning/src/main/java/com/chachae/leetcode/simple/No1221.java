package com.chachae.leetcode.simple;

import java.util.Stack;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/12 16:33
 */
public class No1221 {

  @Test
  public void test() {
    String n = "LLLLRRRR";
    System.out.println(balancedStringSplit(n));
  }

  public int balancedStringSplit2(String s) {
    char[] chars = s.toCharArray();
    int count = 0;
    int dif = 0;
    for (char e : chars) {
      if (e == 'L') {
        dif--;
      } else if (e == 'R') {
        dif++;
      }
      if (dif == 0) {
        count++;
      }
    }
    return count;
  }

  public int balancedStringSplit(String s) {
    char[] chars = s.toCharArray();
    int count = 0;
    Stack<Character> stack = new Stack<>();
    for (char n : chars) {
      if (stack.isEmpty()) {
        stack.push(n);
      } else if (stack.peek() != n) {
        if (stack.size() == 1) {
          count++;
          stack.clear();
        } else {
          stack.pop();
        }
      } else {
        stack.push(n);
      }
    }
    return count;
  }
}
