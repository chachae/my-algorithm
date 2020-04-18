package com.chachae.leetcode.design;

import java.util.Stack;

/**
 * @author chachae
 * @since 2020/4/18 20:34
 */
class MyQueue {

  private final Stack<Integer> read;

  private final Stack<Integer> write;

  private int size = 0;

  /**
   * Initialize your data structure here.
   */
  public MyQueue() {
    read = new Stack<>();
    write = new Stack<>();
  }

  /**
   * Push element x to the back of queue.
   */
  public void push(int x) {
    read.push(x);
    size++;
  }

  /**
   * Removes the element from in front of queue and returns that element.
   */
  public int pop() {
    while (!read.isEmpty()) {
      write.push(read.pop());
    }
    Integer res = write.pop();
    while (!write.isEmpty()) {
      read.push(write.pop());
    }
    return res;
  }

  /**
   * Get the front element.
   */
  public int peek() {
    while (!read.isEmpty()) {
      write.push(read.pop());
    }
    int res = write.peek();
    while (!write.isEmpty()) {
      read.push(write.pop());
    }
    return res;
  }

  /**
   * Returns whether the queue is empty.
   */
  public boolean empty() {
    return read.isEmpty();
  }
}
