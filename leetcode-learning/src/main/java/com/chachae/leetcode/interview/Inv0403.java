package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.ListNode;
import com.chachae.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/list-of-depth-lcci/
 *
 * @author chachae
 * @since 2020/4/15 16:47
 */
public class Inv0403 {

  @Test
  public void test() {
  }

  public ListNode[] listOfDepth(TreeNode tree) {

    List<ListNode> list = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (tree != null) {
      queue.offer(tree);
    }

    while (!queue.isEmpty()) {
      int size = queue.size();
      ListNode dummyHead = new ListNode(-1), pre = dummyHead;
      for (int i = 0; i < size; i++) {
        TreeNode root = queue.poll();
        pre.next = new ListNode(root.val);
        pre = pre.next;
        if (root.left != null) {
          queue.offer(root.left);
        }
        if (root.right != null) {
          queue.offer(root.right);
        }
      }
      list.add(dummyHead.next);
    }

    return list.toArray(new ListNode[0]);
  }
}
