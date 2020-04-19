package com.chachae.leetcode.design;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/submissions/ 双栈实现队列
 *
 * @author chachae
 * @since 2020/4/19 10:25
 */
public class CQueue {

  private final Stack<Integer> s1;
  private final Stack<Integer> s2;
  private int size;

  public CQueue() {
    s1 = new Stack<>();
    s2 = new Stack<>();
    size = 0;
  }

  public void appendTail(int value) {
    s1.push(value);
    size++;
  }

  public int deleteHead() {
    if (size == 0) {
      return -1;
    }

    if (s2.isEmpty()) {
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }
    }
    size--;
    return s2.pop();
  }
}
