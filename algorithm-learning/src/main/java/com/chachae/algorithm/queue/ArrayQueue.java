package com.chachae.algorithm.queue;

import com.chachae.algorithm.array.GenericArray;

/**
 * @author chachae
 * @since 2020/1/6 12:13
 */
public class ArrayQueue<E> implements Queue<E> {

  GenericArray<E> array;

  public ArrayQueue(int capacity) {
    array = new GenericArray<>(capacity);
  }

  public ArrayQueue() {
    array = new GenericArray<>();
  }

  @Override
  public int getSize() {
    return array.getSize();
  }

  @Override
  public boolean isEmpty() {
    return array.isEmpty();
  }

  @Override
  public void enqueue(E e) {

    array.addLast(e);
  }

  @Override
  public E dequeue() {
    return array.removeFirst();
  }

  @Override
  public E getFront() {
    return array.getFirst();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Queue: font [");
    for (int i = 0; i < array.getSize(); i++) {
      sb.append(array.get(i));
      if (i != array.getSize() - 1) {
        sb.append(", ");
      }
    }
    sb.append("] tail");
    return sb.toString();
  }
}
