package com.chachae.algorithm.list;

/**
 * @author chachae
 * @since 2020/1/7 9:00
 */
public class LinkedList<E> {

  private class Node {
    public E e;
    public Node next;

    public Node(E e, Node node) {
      this.e = e;
      this.next = node;
    }

    public Node(E e) {
      this(e, null);
    }

    public Node() {
      this(null, null);
    }

    @Override
    public String toString() {
      return e.toString();
    }
  }

  private Node dummyHead;
  private int size;

  public LinkedList() {
    dummyHead = new Node(null, null);
    size = 0;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void add(int index, E e) {
    if (index > size || index < 0) {
      throw new IllegalArgumentException("Add fail. Illegal index");
    }
    Node prev = dummyHead;
    for (int i = 0; i < index; i++) {
      prev = prev.next;
    }
    Node node = new Node(e);
    node.next = prev.next;
    prev.next = node;
    // prev.next = new Node(e, prev.next);
    size++;
  }

  public void addFirst(E e) {
    add(0, e);
  }

  public void addList(E e) {
    add(size, e);
  }

  public E get(int index) {
    if (index > size || index < 0) {
      throw new IllegalArgumentException("Add fail. Illegal index");
    }
    Node cur = dummyHead.next;
    for (int i = 0; i < index; i++) {
      cur = cur.next;
    }
    return cur.e;
  }

  public E getFirst() {
    return get(0);
  }

  public E getLast() {
    return get(size - 1);
  }

  public void set(int index, E e) {
    if (index > size || index < 0) {
      throw new IllegalArgumentException("Add fail. Illegal index");
    }
    Node cur = dummyHead.next;
    for (int i = 0; i < index; i++) {
      cur = cur.next;
    }
    cur.e = e;
  }

  public E remove(int index) {
    if (index > size || index < 0) {
      throw new IllegalArgumentException("Add fail. Illegal index");
    }
    Node prev = dummyHead;
    for (int i = 0; i < index; i++) {
      prev = prev.next;
    }
    Node retNode = prev.next;
    prev.next = retNode.next;
    retNode.next = null;
    size--;
    return retNode.e;
  }

  public E removeFirst() {
    return remove(0);
  }

  public E removeLast() {
    return remove(size - 1);
  }

  public boolean contains(E e) {
    Node cur = dummyHead.next;
    while (cur != null) {
      if (cur.next == e) {
        return true;
      } else {
        cur = cur.next;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node cur = dummyHead.next;
    while (cur != null) {
      sb.append(cur).append(">-");
      cur = cur.next;
    }
    sb.append("LLUN");
    return sb.reverse().toString();
  }
}
