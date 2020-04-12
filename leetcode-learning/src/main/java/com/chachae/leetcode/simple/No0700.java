package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 *
 * @author chachae
 * @since 2020/4/12 18:48
 */
public class No0700 {

  @Test
  public void test() {
    TreeNode treeNode = new TreeNode(4);
    int[] node = new int[]{2, 7, 1, 3};
    for (int e : node) {
      treeNode.add(e);
    }
    searchBST(treeNode, 5);
  }

  public TreeNode searchBST(TreeNode root, int val) {
    return search(root, val);
  }

  private TreeNode search(TreeNode root, int val) {
    if (root == null) {
      return null;
    }
    if (val == root.val) {
      return root;
    }
    if (val < root.val) {
      return search(root.left, val);
    }
    return search(root.right, val);
  }

}
