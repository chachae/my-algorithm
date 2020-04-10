package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 *
 * @author chachae
 * @since 2020/4/9 21:53
 */
public class Inv0018 {

  @Test
  public void test() {
    System.out.println(deleteNode(new ListNode(new int[]{4, 5, 1, 9}), 9));
  }

  public ListNode deleteNode(ListNode head, int val) {

    if (head == null) {
      return null;
    }

    ListNode cur = head;
    ListNode pre = null;
    if (cur.val == val) {
      return head.next;
    }
    // 3
    // 2 -> 4
    // 3 -> 4 (cur)
    // 1 -> 2 -> 3 -> 4
    // 1 -> 2 -> 3 -> 4

    while (cur != null) {
      if (cur.val == val) {
        pre.next = pre.next.next;
        return head;
      } else {
        pre = cur;
        cur = cur.next;
      }
    }
    return head;
  }
}
