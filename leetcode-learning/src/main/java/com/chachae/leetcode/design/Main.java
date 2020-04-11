package com.chachae.leetcode.design;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/11 23:43
 */
public class Main {

  /**
   *
   * ["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead",
   * "addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
   * [[],[2],[1],[2],[7],[3],[2],[5],[5],[5],[6],[4]]
   *
   */
  @Test
  public void test() {
    MyLinkedList linkedList = new MyLinkedList();
    linkedList.addAtHead(1);
    linkedList.addAtTail(3);
    //链表变为1-> 2-> 3
    linkedList.addAtIndex(1, 2);
    //返回2
    System.out.println(linkedList.get(1));
    //现在链表是1-> 3
    linkedList.deleteAtIndex(1);
    //返回3
    System.out.println(linkedList.get(1));
  }

}
