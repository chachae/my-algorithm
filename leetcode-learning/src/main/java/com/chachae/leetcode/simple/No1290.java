package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * <a
 * href="https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/"></a>
 *
 * @author chachae
 * @since 2020/1/6 20:39
 */
public class No1290 {

  @Test
  public void test() {
    // head = [1,0,1]
    ListNode node = new ListNode(1);
    node.next = new ListNode(0);
    node.next.next = new ListNode(1);
    // System.out.println(getDecimalValue(node))
    System.out.println(getDecimalValue2(node));
  }

  /**
   * My solution
   *
   * @param head ListNode
   * @return int
   */
  public int getDecimalValue(ListNode head) {
    StringBuilder sb = new StringBuilder();
    while (head != null) {
      sb.append(head.val);
      head = head.next;
    }
    return Integer.parseInt(sb.toString(), 2);
  }

  /**
   * Others solution
   *
   * @param head ListNode
   * @return int
   */
  public int getDecimalValue2(ListNode head) {
    int m = 0;
    ListNode current = head;
    while (current != null) {
      m <<= 1;
      m += current.val;
      current = current.next;
    }
    return m;
  }
}
