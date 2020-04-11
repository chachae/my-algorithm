package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 *
 * @author chachae
 * @since 2020/4/11 21:36
 */
public class No0160 {

  @Test
  public void test() {
    ListNode a = new ListNode(new int[]{4, 1, 8, 4, 5});
    ListNode b = new ListNode(new int[]{5, 0, 1, 8, 4, 5});
    System.out.println(getIntersectionNode(a, b));
  }

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }

    ListNode a = headA;
    ListNode b = headB;
    while (a != b) {
      a = a == null ? headB : a.next;
      b = b == null ? headA : b.next;
    }
    return a;
  }
}
