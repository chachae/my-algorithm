package com.chachae.algorithm.list;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/1/7 9:59
 */
public class LinkListTest {

  @Test
  public void test() {
    LinkedList<Integer> list = new LinkedList<>();
    int count = 5;
    for (int i = 0; i < count; i++) {
      list.addFirst(i);
      System.out.println(list);
    }
    list.add(2, 666);
    System.out.println(list);
    list.remove(2);
    System.out.println(list);
    list.removeFirst();
    System.out.println(list);
    list.removeLast();
    System.out.println(list);
  }
}
