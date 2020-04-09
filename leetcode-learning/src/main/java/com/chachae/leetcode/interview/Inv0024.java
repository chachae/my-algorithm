package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 *
 * @author chachae
 * @since 2020/4/9 19:12
 */
public class Inv0024 {

  @Test
  public void test() {
    System.out.println(reverseList2(new ListNode(new int[]{1, 2, 3, 4, 5})));
  }

  /**
   * 递归 1 -> 2 -> 3
   */
  public ListNode reverseList(ListNode head) {

    if (head == null || head.next == null) {
      return head;
    }

    ListNode node = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return node;
  }

  /**
   * 迭代
   */
  public ListNode reverseList2(ListNode head) {
    ListNode pre = null, cur = head, next;
    while (cur != null) {
      next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }
    return pre;
  }


}
