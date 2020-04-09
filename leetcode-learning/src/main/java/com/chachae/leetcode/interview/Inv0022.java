package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 *
 * @author chachae
 * @since 2020/4/9 19:10
 */
public class Inv0022 {

  @Test
  public void test() {
    System.out.println(getKthFromEnd(new ListNode(new int[]{1, 2, 3, 4, 5}), 2));
  }


  public ListNode getKthFromEnd(ListNode head, int k) {
    int count = 0;
    int len = rev(head, count);
    for (int i = 0; i < (len - k); i++) {
      head = head.next;
    }
    return head;
  }

  private int rev(ListNode cur, int count) {
    while (cur != null) {
      count++;
      cur = cur.next;
    }
    return count;
  }
}
