package com.chachae.algorithm.stack;

/**
 * @author chachae
 * @since 2020/1/6 10:46
 */
public interface Stack<E> {

  /**
   * 获取栈大小
   *
   * @return int
   */
  int getSize();

  /**
   * 判断站是否为空栈
   *
   * @return boolean
   */
  boolean isEmpty();

  /**
   * 入栈
   *
   * @param e 入栈元素
   */
  void push(E e);

  /**
   * 出栈
   *
   * @return E
   */
  E pop();

  /**
   * 栈顶元素
   *
   * @return E
   */
  E peek();
}
