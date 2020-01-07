package com.chachae.algorithm.stack;

import com.chachae.algorithm.list.LinkedList;

/**
 * @author chachae
 * @since 2020/1/7 10:25
 */
public class LinkedListStack<E> implements Stack<E> {

  LinkedList<E> list;

  public LinkedListStack() {
    list = new LinkedList<>();
  }

  @Override
  public int getSize() {
    return list.getSize();
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public void push(E e) {
    list.addFirst(e);
  }

  @Override
  public E pop() {
    return list.removeFirst();
  }

  @Override
  public E peek() {
    return list.getFirst();
  }

  @Override
  public String toString() {
    return "Stack : top " + list;
  }
}
