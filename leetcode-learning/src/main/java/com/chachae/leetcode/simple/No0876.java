package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;

/**
 * <a href="https://leetcode-cn.com/problems/middle-of-the-linked-list/submissions/"/>
 *
 * @author chachae
 * @since 2020/2/3 22:13
 */
public class No0876 {

  public ListNode middleNode(ListNode head) {

    int count = 0;
    ListNode cur = head;

    // 获取节点数
    while (cur != null) {
      count++;
      cur = cur.next;
    }

    for (int i = 0; i < count / 2; i++) {
      head = head.next;
    }
    return head;
  }
}
