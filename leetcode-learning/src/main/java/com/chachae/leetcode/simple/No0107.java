package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 *
 * @author chachae
 * @since 2020/4/17 11:46
 */
public class No0107 {

  public void test() {
  }

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    LinkedList<List<Integer>> result = new LinkedList<>();
    if (root == null) {
      return result;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      List<Integer> oneLevel = new ArrayList<>();
      int count = queue.size();
      for (int i = 0; i < count; i++) {
        TreeNode node = queue.poll();
        oneLevel.add(node.val);
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      result.addFirst(oneLevel);
    }
    return result;
  }
}
