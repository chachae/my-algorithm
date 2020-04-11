package com.chachae.leetcode.medium;

import com.chachae.leetcode.common.ListNode;
import com.chachae.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/11 22:33
 */
public class No0109 {

  @Test
  public void test() {
    ListNode node = new ListNode(new int[]{-10, -3, 0, 5, 9});
    sortedListToBST(node);
  }

  public TreeNode sortedListToBST2(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    // 快慢找中点（slow）
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode node = slow;
    TreeNode treeNode = new TreeNode(node.val);

    while (head != null) {
      add(treeNode, head.val);
      head = head.next;
    }

    return treeNode;
  }

  private TreeNode add(TreeNode node, int e) {
    if (node == null) {
      return null;
    }
    if (e < node.val) {
      node.left = add(node.left, e);
    } else if (e > node.val) {
      node.right = add(node.right, e);
    }
    return node;
  }

  public TreeNode sortedListToBST(ListNode head) {
    if (head == null) {
      return null;
    }
    if (head.next == null) {
      return new TreeNode(head.val);
    }
    // -10, -3, 0, 5, 9
    ListNode pre = head, slow = head.next, fast = head.next.next;
    while (fast != null && fast.next != null) {
      pre = pre.next;
      slow = slow.next;
      fast = fast.next.next;
    }
    pre.next = null;
    TreeNode root = new TreeNode(slow.val);
    root.left = sortedListToBST(head);
    root.right = sortedListToBST(slow.next);
    return root;
  }
}

