package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/submissions/"></a>
 *
 * @author chachae
 * @since 2020/1/7 12:01
 */
public class No0021 {

  @Test
  public void test() {
    // 有序链表
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);
    ListNode res = mergeTwoLists(l1, l2);
    while (res != null) {
      System.out.println(res.val);
      res = res.next;
    }
  }

  /**
   * My solution
   *
   * @param l1 l1
   * @param l2 l2
   * @return ListNode
   */
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    List<Integer> list1 = new ArrayList<>();
    while (l1 != null) {
      list1.add(l1.val);
      l1 = l1.next;
    }
    while (l2 != null) {
      list1.add(l2.val);
      l2 = l2.next;
    }
    Collections.sort(list1);
    ListNode head = new ListNode(1);
    ListNode t = head;
    for (Integer n : list1) {
      t.next = new ListNode(n);
      t = t.next;
    }
    return head.next;
  }

  /**
   * Others solution
   *
   * @param l1 l1
   * @param l2 l2
   * @return ListNode
   */
  public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    } else if (l1.val < l2.val) {
      l1.next = this.mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = this.mergeTwoLists(l1, l2.next);
      return l2;
    }
  }
}
