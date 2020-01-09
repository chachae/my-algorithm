package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/1/9 22:52
 */
public class No0083 {

  @Test
  public void test() {
    // 1->2->6->3->4->5->6, val = 6
    ListNode node = new ListNode(1);
    node.next = new ListNode(1);
    node.next.next = new ListNode(2);
    node.next.next.next = new ListNode(3);
    node.next.next.next.next = new ListNode(3);
    ListNode listNode = deleteDuplicates(node);
    while (listNode != null) {
      System.out.println("result: " + listNode.val);
      listNode = listNode.next;
    }
  }

  public ListNode deleteDuplicates(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fastNode = head;
    while (fastNode != null) {
      if (fastNode.next != null && fastNode.val == fastNode.next.val) {
        fastNode.next = fastNode.next.next;
      } else {
        fastNode = fastNode.next;
      }
    }

    return dummy.next;
  }
}
