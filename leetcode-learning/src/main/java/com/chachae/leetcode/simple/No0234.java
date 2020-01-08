package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/palindrome-linked-list/submissions/"></a>
 *
 * @author chachae
 * @since 2020/1/8 22:10
 */
public class No0234 {

  @Test
  public void test() {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(1);
    System.out.println(isPalindrome(node));
  }

  /**
   * my solution
   *
   * @param head LinkedList
   * @return boolean
   */
  public boolean isPalindrome(ListNode head) {
    List<Integer> list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }
    int len = list.size();
    for (int i = 0; i < len / 2; i++) {
      if (!list.get(i).equals(list.get(len - i - 1))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Others solution
   *
   * @param head LinkedList
   * @return boolean
   */
  public boolean isPalindrome2(ListNode head) {
    // 边界条件头结点为空以及只有一个节点的情况
    if (head == null || head.next == null) {
      return true;
    }
    // 仅有连个节点的情况
    if (head.next.next == null) {
      return head.val == head.next.val;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    // 针对于大于等于3个节点的链表，所以用slow与fast.next比较
    while (fast.next != null) {
      if (slow.val == fast.next.val) {
        // 第一次是判断是不是第一个和最后一个相同（判断到达末节点）
        if (fast.next.next != null) {
          return false;

        } else {
          // 满足相同，则指后一个节点为空
          fast.next = null;
          // 慢指针前移一步
          slow = slow.next;
          // 快指针比慢指针快一步
          fast = slow.next;
        }
        // 判断是否过半（奇数个几点。此时s是单独的）或者中间两个相同，需判断fast.next是已判断过的，即为null（偶数个节点）
        if (fast == null || (slow.val == fast.val && fast.next == null)) {
          // （判断到达中间）
          return true;
        }
      } else {
        // 若slow的值不等于fast.next，则fast 后移
        fast = fast.next;
      }
    }
    return false;
  }
}
