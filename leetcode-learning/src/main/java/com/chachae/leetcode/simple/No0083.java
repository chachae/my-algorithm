package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/"></a>
 *
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
    ListNode fast = head;
    while (fast != null) {
      if (fast.next != null && fast.val == fast.next.val) {
        fast.next = fast.next.next;
      } else {
        fast = fast.next;
      }
    }
    return dummy.next;
  }

  /** Others solution */
  public ListNode deleteDuplicates2(ListNode pHead) {
    if (pHead == null || pHead.next == null) {
      return pHead;
    }
    ListNode next = pHead.next;
    if (next.val == pHead.val) {
      next = next.next;
      while (next != null && next.val == pHead.val) {
        next = next.next;
      }
    }
    pHead.next = deleteDuplicates2(next);
    return pHead;
  }
}
