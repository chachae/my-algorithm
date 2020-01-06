package com.chachae.algorithm.stack;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/1/6 11:15
 */
public class MainTest {

  @Test
  public void testStack() {
    Stack<Integer> stack = new ArrayStack<>();
    for (int i = 0; i < 5; i++) {
      stack.push(i);
      System.out.println(stack);
    }
    stack.pop();
    System.out.println(stack);
  }
}
