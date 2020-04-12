package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/12 18:13
 */
public class No0104 {

  @Test
  public void test() {
    TreeNode node = new TreeNode(-8);
    int[] n = new int[]{-6, 7, 6, 5};
    for (int e : n) {
      node.add(e);
    }
    System.out.println(maxDepth(node));
  }

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = cal(root.left, 0);
    int right = cal(root.right, 0);
    return Math.max(left, right);
  }

  private int cal(TreeNode node, int depth) {
    if (node != null) {
      depth++;
    }
    if (node == null) {
      depth++;
      return depth;
    }
    depth = Math.max(cal(node.left, depth), cal(node.right, depth));
    return depth;
  }
}
