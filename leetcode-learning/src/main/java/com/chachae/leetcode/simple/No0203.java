package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * <a href="https://leetcode-cn.com/problems/remove-linked-list-elements/"></a>
 *
 * @author chachae
 * @since 2020/1/9 21:37
 */
public class No0203 {

  @Test
  public void test() {
    // 1->2->6->3->4->5->6, val = 6
    ListNode node = new ListNode(new int[]{1, 2, 6, 3, 4, 5, 6});
    ListNode listNode = removeElements2(node, 6);
    System.out.println(listNode.toString());
  }

  public ListNode removeElements(ListNode head, int val) {
    ListNode node = new ListNode(0);
    node.next = head;
    ListNode cur = node;
    while (cur.next != null) {
      if (cur.next.val == val) {
        cur.next = cur.next.next;
      } else {
        cur = cur.next;
      }
    }
    return node.next;
  }

  /**
   * 递归解法
   */
  public ListNode removeElements2(ListNode head, int val) {

    if (head == null) {
      return null;
    }

    head.next = removeElements2(head.next, val);
    return head.val == val ? head.next : head;
  }
}
