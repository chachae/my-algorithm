package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * TODO https://leetcode-cn.com/problems/palindrome-linked-list-lcci/
 *
 * @author chachae
 * @since 2020/4/9 23:18
 */
public class Inv0206 {

  @Test
  public void test() {
    int[] ints = {1, 2, 2, 1};
    ListNode node = new ListNode(ints);
    System.out.println(isPalindrome(node));
  }

  public boolean isPalindrome(ListNode head) {

    ListNode fast = head;
    ListNode slow = head;

    // 快慢指针找中点
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // rev slow
    ListNode pre = null, cur = slow, temp;
    while (cur != null) {
      temp = cur.next;
      cur.next = pre;
      pre = cur;
      cur = temp;
    }

    // 前后两段比较是否一致
    ListNode old = head;
    while (pre != null) {
      if (pre.val != old.val) {
        return false;
      }
      head = head.next;
      pre = pre.next;
    }
    return true;
  }

}
