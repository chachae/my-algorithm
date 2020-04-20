package com.chachae.leetcode.design;

/**
 * https://leetcode-cn.com/problems/design-circular-queue/ 设计循环队列
 *
 * @author chachae
 * @since 2020/4/20 21:08
 */
public class MyCircularQueue {


  private int[] data;

  private int front;

  private int tail;

  /**
   * Initialize your data structure here. Set the size of the queue to be k.
   */
  public MyCircularQueue(int k) {
    data = new int[k + 1];
    front = tail = 0;
  }

  /**
   * Insert an element into the circular queue. Return true if the operation is successful.
   */
  public boolean enQueue(int value) {
    if (isFull()) {
      return false;
    } else {
      data[tail] = value;
      tail = (tail + 1) % data.length;
      return true;
    }
  }

  /**
   * Delete an element from the circular queue. Return true if the operation is successful.
   */
  public boolean deQueue() {
    if (isEmpty()) {
      return false;
    } else {
      front = (front + 1) % data.length;
      return true;
    }
  }

  /**
   * Get the front item from the queue.
   */
  public int Front() {
    return isEmpty() ? -1 : data[front];
  }

  /**
   * Get the last item from the queue.
   */
  public int Rear() {
    return isEmpty() ? -1 : this.data[(tail == 0) ? data.length - 1 : tail - 1];
  }

  /**
   * Checks whether the circular queue is empty or not.
   */
  public boolean isEmpty() {
    return front == tail;
  }

  /**
   * Checks whether the circular queue is full or not.
   */
  public boolean isFull() {
    return (tail + 1) % data.length == front;
  }
}
