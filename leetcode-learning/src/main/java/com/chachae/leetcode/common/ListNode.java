package com.chachae.leetcode.common;

/**
 * 公共链表
 *
 * @author chachae
 * @since 2020/1/6 20:39
 */
public class ListNode {
  // 当前值
  public int val;
  // 下一个节点
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  // 链表节点的构造函数
  // 使用arr为参数，创建一个链表，当前的ListNode为链表头结点
  public ListNode(int[] arr) {

    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("arr can not be empty");
    }

    this.val = arr[0];
    ListNode cur = this;
    for (int i = 1; i < arr.length; i++) {
      cur.next = new ListNode(arr[i]);
      cur = cur.next;
    }
  }

  // 以当前节点为头结点的链表信息字符串
  @Override
  public String toString() {

    StringBuilder s = new StringBuilder();
    ListNode cur = this;
    while (cur != null) {
      s.append(cur.val).append("->");
      cur = cur.next;
    }
    s.append("NULL");
    return s.toString();
  }
}
