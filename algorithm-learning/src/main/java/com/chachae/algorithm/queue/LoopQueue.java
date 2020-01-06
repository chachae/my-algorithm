package com.chachae.algorithm.queue;

/**
 * @author chachae
 * @since 2020/1/6 15:03
 */
public class LoopQueue<E> implements Queue<E> {

  private E[] data;
  private int front, tail, size;

  @SuppressWarnings("unchecked")
  public LoopQueue(int capacity) {
    data = (E[]) new Object[capacity + 1];
    front = 0;
    tail = 0;
    size = 0;
  }

  public LoopQueue() {
    this(10);
  }

  public int getCapacity() {
    return data.length - 1;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return tail == front;
  }

  @Override
  public void enqueue(E e) {
    if ((tail + 1) % data.length == front) {
      resize(getCapacity() * 2);
    }
    data[tail] = e;
    tail = (tail + 1) % data.length;
    size++;
  }

  @SuppressWarnings("unchecked")
  private void resize(int newCapacity) {
    E[] newData = (E[]) new Object[newCapacity + 1];
    for (int i = 0; i < size; i++) {
      newData[i] = data[(i + front) % data.length];
    }
    data = newData;
    front = 0;
    tail = size;
  }

  @Override
  public E dequeue() {
    if (isEmpty()) {
      throw new IllegalArgumentException("Can't dequeue from an empty queue");
    }
    E ret = data[front];
    data[front] = null;
    front = (front + 1) % data.length;
    size--;
    if (size == getCapacity() && getCapacity() / 2 != 0) {
      resize(getCapacity() / 2);
    }
    return ret;
  }

  @Override
  public E getFront() {
    if (isEmpty()) {
      throw new IllegalArgumentException("Can't dequeue from an empty queue");
    }
    return data[front];
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("Queue : size = %d, capacity = %d\n", size, getCapacity()));
    sb.append("[");
    for (int i = front; i != tail; i = (i + 1) % data.length) {
      sb.append(data[i]);
      if (i != size - 1) {
        sb.append(", ");
      }
    }
    sb.append("] tail");
    return sb.toString();
  }
}
