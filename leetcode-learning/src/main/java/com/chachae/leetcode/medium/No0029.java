package com.chachae.leetcode.medium;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * <a href="https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/"></a>
 *
 * @author chachae
 * @since 2020/2/4 10:44
 */
public class No0029 {

  @Test
  public void test() {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    ListNode res = removeNthFromEnd(node, 5);
    while (res != null) {
      System.out.println(res.val);
      res = res.next;
    }
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode pre = new ListNode(0);
    pre.next = head;
    ListNode temp = head;
    int len = 0;
    while (temp != null) {
      temp = temp.next;
      len++;
    }

    len -= n;
    temp = pre;
    while (len > 0) {
      temp = temp.next;
      len--;
    }
    temp.next = temp.next.next;
    return pre.next;
  }
}
