package com.chachae.leetcode.medium;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * <a href="https://leetcode-cn.com/problems/swap-nodes-in-pairs/submissions/"></a>
 *
 * @author chachae
 * @since 2020/2/3 22:22
 */
public class No0024 {

  @Test
  public void test() {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    ListNode res = swapPairs(node);
    while (res != null) {
      System.out.println(res.val);
      res = res.next;
    }
  }

  public ListNode swapPairs(ListNode head) {

    // exit
    if (head == null || head.next == null) {
      return head;
    }

    // pre = 234 head = 1234
    ListNode pre = head.next;
    // head = 143
    head.next = swapPairs(pre.next);
    pre.next = head;
    return pre;
  }
}
