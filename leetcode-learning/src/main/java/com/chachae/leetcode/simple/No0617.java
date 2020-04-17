package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/16 21:48
 */
public class No0617 {

  @Test
  public void test() {
    TreeNode a1 = new TreeNode(1);
    TreeNode a2 = new TreeNode(1);
    int[] a = {3, 2, 5};
    int[] b = {1, 3, 4, 7};
    for (int i : a) {
      a1.add(i);
    }
    for (int i : b) {
      a2.add(i);
    }
    mergeTrees(a1, a2).preOrderNR();
  }


  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return null;
    }
    TreeNode root = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));
    root.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
    root.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
    return root;
  }
}
