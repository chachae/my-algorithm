package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/9 18:41
 */
public class Inv0202 {

  @Test
  public void test() {
    System.out.println(kthToLast(new ListNode(new int[]{1, 2, 3, 4, 5}), 2));
  }


  public int kthToLast(ListNode head, int k) {
    int count = 0;
    int len = rev(head, count);
    for (int i = 0; i < (len - k); i++) {
      head = head.next;
    }
    return head.val;
  }

  private int rev(ListNode cur, int count) {
    while (cur != null) {
      count++;
      cur = cur.next;
    }
    return count;
  }

}
