package com.chachae.algorithm.queue;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/1/6 12:17
 */
public class MainTest {

  @Test
  public void test() {
    Queue<Integer> queue = new ArrayQueue<>();
    for (int i = 0; i < 10; i++) {
      queue.enqueue(i);
      System.out.println(queue);
      if (i % 3 == 2) {
        queue.dequeue();
        System.out.println(queue);
      }
    }
  }
}
