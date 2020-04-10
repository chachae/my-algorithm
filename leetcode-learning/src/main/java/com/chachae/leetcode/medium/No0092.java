package com.chachae.leetcode.medium;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list-ii/
 *
 * @author chachae
 * @since 2020/4/9 22:46
 */
public class No0092 {

  @Test
  public void test() {
    System.out.println(reverseBetween(new ListNode(new int[]{1, 2, 3, 4, 5}), 2, 4));
  }


  public ListNode reverseBetween(ListNode head, int m, int n) {

    // 1 4 3 2 5
    // pre
    // cur
    // 1 2 3 4 5
    // dummy : 0 1 3 4 5
    // pre : 2 2 3 4 5
    // head: 1 4 5
    // net: 3 4 5
    /**
     *
     * 定位到要反转部分的头节点 2，head = 2；前驱结点 1，pre = 1；
     * 当前节点的下一个节点3调整为前驱节点的下一个节点 1->3->2->4->5,
     * 当前结点仍为2， 前驱结点依然是1，重复上一步操作。。。
     * 1->4->3->2->5.
     */
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode pre = dummy;
    for (int i = 1; i < m; i++) {
      pre = pre.next;
    }

    // x2
    for (int i = m; i < n; i++) {
      ListNode net = head.next;
      head.next = net.next;
      net.next = pre.next;
      pre.next = net;
    }

    return dummy.next;
  }

}
