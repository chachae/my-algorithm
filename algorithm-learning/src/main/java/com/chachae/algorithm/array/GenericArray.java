package com.chachae.algorithm.array;

/**
 * 泛型数组
 *
 * @author chachae
 * @since 2020/1/5 13:45
 */
public class GenericArray<E> {

  // 数组内容
  private E[] data;
  // 元素个数
  private int size;

  @SuppressWarnings("unchecked")
  public GenericArray(int capacity) {
    data = (E[]) new Object[capacity];
  }

  /** 默认容量为10 */
  public GenericArray() {
    this(10);
  }

  /**
   * 元素个数
   *
   * @return int
   */
  public int getSize() {
    return size;
  }

  /**
   * 数组容量
   *
   * @return int
   */
  public int getCapacity() {
    return data.length;
  }

  /**
   * 是否为空
   *
   * @return boolean
   */
  public boolean isEmpty() {
    return data.length == 0;
  }

  /**
   * 向数组中追加元素
   *
   * @param e 元素
   */
  public void addLast(E e) {
    add(size, e);
  }

  /**
   * 索引0的位置插入元如
   *
   * @param e 待插入的元素
   */
  public void addFirst(E e) {
    add(0, e);
  }

  /**
   * 向指定索引位置添加元素
   *
   * @param index 索引位置
   * @param e 待插入的元素
   */
  public void add(int index, E e) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("add fail. Index error");
    }
    if (size == data.length) {
      throw new IllegalArgumentException("add fail. Array is full");
    }
    for (int i = size - 1; i >= index; i--) {
      data[i + 1] = data[i];
    }
    data[index] = e;
    size++;
  }

  /**
   * 获取索引位置上的元素
   *
   * @param index 索引
   * @return 该位置上的元素
   */
  public E get(int index) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("add fail. Index error");
    }
    return data[index];
  }

  public E getFirst() {
    return get(0);
  }

  public E getLast() {
    return get(size - 1);
  }

  /**
   * 查看元素是否存在
   *
   * @param e 元素
   */
  public boolean contains(E e) {
    for (E elem : data) {
      if (elem.equals(e)) {
        return true;
      }
    }
    return false;
  }

  /**
   * 获取元素索引位置
   *
   * @param e 元素
   */
  public int find(E e) {
    for (int i = 0; i < data.length; i++) {
      if (data[i].equals(e)) {
        return i;
      }
    }
    return -1;
  }

  /**
   * 修改索引位置的元素
   *
   * @param index 索引位置
   * @param e 新元素
   */
  public void set(int index, E e) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("add fail. Index error");
    }
    data[index] = e;
  }

  /**
   * 移除索引下的元素
   *
   * @param index 索引位置
   * @return 被删除的元素值
   */
  public E remove(int index) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("add fail. Index error");
    }
    E ret = data[index];
    for (int i = index + 1; i <= size; i++) {
      data[i - 1] = data[i];
    }
    size--;
    return ret;
  }

  /**
   * 移除第一个元素
   *
   * @return 被删除元素的值
   */
  public E removeFirst() {
    return remove(0);
  }

  /**
   * 移除最后一个元素
   *
   * @return 被删除元素的值
   */
  public E removeLast() {
    return remove(size - 1);
  }

  /**
   * 移除元素
   *
   * @return 被删除元素值
   */
  public void removeElement(E e) {
    int index = find(e);
    if (index != -1) {
      remove(index);
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("Array size : %s ,Array capacity: %s\n", size, data.length));
    sb.append("[");
    for (int i = 0; i < size; i++) {
      sb.append(data[i]);
      if (i != size - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }
}
