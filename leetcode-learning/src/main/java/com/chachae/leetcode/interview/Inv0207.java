package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
 *
 * @author chachae
 * @since 2020/4/10 22:48
 */
public class Inv0207 {

  @Test
  public void test() {
    int[] a = new int[]{4, 1, 8, 4, 5};
    int[] b = new int[]{5, 0, 1, 8, 4, 5};
    System.out.println(getIntersectionNode(new ListNode(a), new ListNode(b)));
  }

  /**
   * 4 1 8 4 5
   * 5 0 1 8 4 5
   *
   * 41845 501845
   * 5 45
   * NULL 5
   * 4 1 8 4 5 null 5 0 1 8 4 5
   * 5 0 1 8 4 5 null 4 1 8 4 5
   *
   * 1845 01845
   * 845 1845
   * 45 845
   * 5 45
   * null 5
   * 501845 null
   * 01845 41845
   * 1845 418
   */
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }
    ListNode nodeA = headA;
    ListNode nodeB = headB;
    while (nodeA != nodeB) {
      nodeA = nodeA == null ? headB : nodeA.next;
      nodeB = nodeB == null ? headA : nodeB.next;
      System.out.println("cur:"+headB);
    }
    return nodeA;
  }

}
