package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/2/3 21:12
 */
public class No0206 {

  @Test
  public void test() {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    ListNode res = reverseList(node);
    System.out.println(res.val);
  }

  public ListNode reverseList(ListNode head) {

    ListNode pre = null;
    ListNode cur = head;

    while (cur != null) {
      ListNode temp = cur.next;
      cur.next = pre;
      pre = cur;
      cur = temp;
    }
    return pre;
  }
}
