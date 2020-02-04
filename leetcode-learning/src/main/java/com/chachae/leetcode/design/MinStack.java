package com.chachae.leetcode.design;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * <a href="https://leetcode-cn.com/problems/min-stack/"></a>
 *
 * @author chachae
 * @since 2020/2/4 11:48
 */
public class MinStack {

  // 初始化一个空栈
  private Stack<Integer> stack = new Stack<>();

  public MinStack() {}

  public void push(int x) {
    if (stack.isEmpty()) {
      stack.push(x);
      stack.push(x);
    } else {
      int tmp = stack.peek();
      stack.push(x);
      stack.push(Math.min(tmp, x));
    }
  }

  public void pop() {
    stack.pop();
    stack.pop();
  }

  public int top() {
    return stack.get(stack.size() - 2);
  }

  public int getMin() {
    return stack.peek();
  }

  @Test
  public void test() {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.push(-3);
    minStack.push(-3);
    minStack.push(-5);
    System.out.println(minStack.getMin()); // 返回 -3.
    minStack.pop();
    minStack.pop();
    minStack.pop();
    minStack.pop();
    System.out.println(minStack.top()); // 返回 0.
    System.out.println(minStack.getMin()); // 返回 -2.
  }
}
