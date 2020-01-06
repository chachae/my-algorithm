package com.chachae.algorithm.queue;

/**
 * @author chachae
 * @since 2020/1/6 12:11
 */
public interface Queue<E> {

  int getSize();

  boolean isEmpty();

  void enqueue(E e);

  E dequeue();

  E getFront();
}
