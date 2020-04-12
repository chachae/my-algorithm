package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 *
 * @author chachae
 * @since 2020/4/12 19:15
 */
public class Inv0025 {

  @Test
  public void test() {
    ListNode l1 = new ListNode(new int[]{1, 2, 4});
    ListNode l2 = new ListNode(new int[]{1, 3, 4});
    System.out.println(mergeTwoLists(l1, l2));
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }

    if (l1.val <= l2.val) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }
  }

  /**
   * 迭代
   */
  public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
    // 虚拟头结点
    ListNode dummy = new ListNode(0), pre = dummy;

    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        pre.next = l1;
        l1 = l1.next;
      } else {
        pre.next = l2;
        l2 = l2.next;
      }
      pre = pre.next;
    }
    if (l1 != null) {
      pre.next = l1;
    }
    if (l2 != null) {
      pre.next = l2;
    }
    return dummy.next;
  }
}
