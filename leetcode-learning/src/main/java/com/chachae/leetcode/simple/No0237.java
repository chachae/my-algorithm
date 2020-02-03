package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/2/3 22:08
 */
public class No0237 {

  @Test
  public void test() {
    ListNode node = new ListNode(4);
    node.next = new ListNode(5);
    node.next.next = new ListNode(1);
    node.next.next.next = new ListNode(9);
    deleteNode(node);
  }

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
