package com.chachae.leetcode.medium;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/rotate-list/
 *
 * @author chachae
 * @since 2020/4/11 18:13
 */
public class No0061 {

  /**
   * 输入: 1->2->3->4->5->NULL, k = 2 输出: 4->5->1->2->3->NULL
   * <p>
   * 1 2 3 2 3 1 3->4->5->NULL temp = 1 2 3 cur=3
   */

// 4->5->1->2->3
  @Test
  public void test() {
    System.out.println(rotateRight(new ListNode(new int[]{1, 2, 3, 4, 5}), 2));
  }

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }

    int count = 1;
    ListNode tmp = head;
    while (tmp.next != null) {
      count++;
      tmp = tmp.next;
    }
    k %= count;
    // 当k为0时，不需要旋转，
    if (k == 0) {
      return head;
    }
      // 512345 循环
    // 不满足上述条件，必将进行旋转，所以先将首尾相连
    tmp.next = head;
    // 现在只需要找到倒数第k+1个节点
    for (int i = 0; i < count - k; i++) {
      tmp = tmp.next;
    }

    ListNode newHead = tmp.next;
    tmp.next = null;
    // System.out.println(newHead);
    return newHead;
  }
}