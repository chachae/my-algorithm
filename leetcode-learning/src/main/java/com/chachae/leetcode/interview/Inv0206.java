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
    ListNode node = head;
    reverse(head);
    System.out.println(node);
    System.out.println(head);
    return true;
  }

  private ListNode reverse(ListNode head) {
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
