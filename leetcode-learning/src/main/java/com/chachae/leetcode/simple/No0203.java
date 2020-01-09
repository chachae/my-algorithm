package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * <a href="https://leetcode-cn.com/problems/remove-linked-list-elements/"></a>
 *
 * @author chachae
 * @since 2020/1/9 21:37
 */
public class No0203 {

  @Test
  public void test() {
    // 1->2->6->3->4->5->6, val = 6
    ListNode node = new ListNode(1);
    node.next = new ListNode(1);
    node.next.next = new ListNode(6);
    node.next.next.next = new ListNode(3);
    node.next.next.next.next = new ListNode(4);
    node.next.next.next.next.next = new ListNode(5);
    node.next.next.next.next.next.next = new ListNode(6);
    ListNode listNode = removeElements(node, 1);
    while (listNode != null) {
      System.out.println("result: " + listNode.val);
      listNode = listNode.next;
    }
  }

  public ListNode removeElements(ListNode head, int val) {
    // 带头节点的链表
    ListNode header = new ListNode(-1);
    // 带头结点链表的下一个指向head
    header.next = head;
    // cur 指向带头结点的新链表
    ListNode cur = header;
    while (cur.next != null) {
      if (cur.next.val == val) {
        cur.next = cur.next.next;
      } else {
        cur = cur.next;
      }
    }
    return header.next;
  }
}
