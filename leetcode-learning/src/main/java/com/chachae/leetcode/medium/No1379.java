package com.chachae.leetcode.medium;

import com.chachae.leetcode.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/comments/
 *
 * @author chachae
 * @since 2020/4/15 15:54
 */
public class No1379 {

  public void test() {
  }

  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned,
      final TreeNode target) {
    if (original == null) {
      return null;
    }

    if (original == target) {
      return cloned;
    }

    TreeNode res = getTargetCopy(original.left, cloned.left, target);
    res = res == null ? getTargetCopy(original.right, cloned.right, target) : res;
    return res;
  }
}
