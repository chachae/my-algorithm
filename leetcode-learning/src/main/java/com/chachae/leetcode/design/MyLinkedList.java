package com.chachae.leetcode.design;

/**
 * @author chachae
 * @since 2020/4/11 23:21
 */
public class MyLinkedList {

  /**
   * Initialize your data structure here.
   */
  private int[] data;

  private int capacity;

  private int size;

  private static final float FACTOR = 0.75f;

  public MyLinkedList(int capacity) {
    data = new int[capacity];
    this.size = 0;
    this.capacity = capacity;
  }

  public MyLinkedList() {
    this(16);
  }

  /**
   * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
   */
  public int get(int index) {
    if (index < 0 || index >= size) {
      return -1;
    }
    for (int i = 0; i < size; i++) {
      if (i == index) {
        return data[i];
      }
    }
    return -1;
  }

  private void ensureCapacity() {
    if (size > capacity * FACTOR) {
      capacity = capacity << 1;
      int[] newData = new int[capacity];
      System.arraycopy(data, 0, newData, 0, size);
      data = newData;
    }
  }

  /**
   * Add a node of value val before the first element of the linked list. After the insertion, the
   * new node will be the first node of the linked list.
   */
  public void addAtHead(int val) {
    ensureCapacity();
    System.arraycopy(data, 0, data, 1, size);
    data[0] = val;
    size++;
  }

  /**
   * Append a node of value val to the last element of the linked list.
   */
  public void addAtTail(int val) {
    ensureCapacity();
    data[size] = val;
    size++;
  }

  /**
   * Add a node of value val before the index-th node in the linked list. If index equals to the
   * length of linked list, the node will be appended to the end of linked list. If index is greater
   * than the length, the node will not be inserted.
   */
  public void addAtIndex(int index, int val) {
    if (index <= 0) {
      addAtHead(val);
    } else if (index == size) {
      addAtTail(val);
    } else if (index < capacity) {
      ensureCapacity();
      int[] newData = new int[capacity];
      System.arraycopy(data, 0, newData, 0, index);
      newData[index] = val;
      System.arraycopy(data, index, newData, index + 1, size - index);
      data = newData;
      size++;
    }
  }

  /**
   * Delete the index-th node in the linked list, if the index is valid.
   */
  public void deleteAtIndex(int index) {
    if (index < size) {
      System.arraycopy(data, index + 1, data, index, size - index);
      data[size - 1] = 0;
      size--;
    }
  }
}
