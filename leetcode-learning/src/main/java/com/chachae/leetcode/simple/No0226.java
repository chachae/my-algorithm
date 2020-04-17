package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/invert-binary-tree/
 *
 * @author chachae
 * @since 2020/4/17 10:03
 */
public class No0226 {

  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }

    TreeNode tmp = root.left;
    root.left = invertTree(root.right);
    root.right = invertTree(tmp);
    return root;
  }

}
