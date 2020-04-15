package com.chachae.leetcode.medium;

import com.chachae.leetcode.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/sum-of-nodes-with-even-valued-grandparent/
 *
 * @author chachae
 * @since 2020/4/15 16:17
 */
public class No1315 {

  public void test() {
    TreeNode treeNode = new TreeNode(6);
    int[] es = new int[]{7, 8, 2, 7, 1, 3, 9, 1, 4, 5};
    for (int e : es) {
      treeNode.add(e);
    }

    System.out.println(sumEvenGrandparent(treeNode));
  }


  public int sumEvenGrandparent(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int temp = 0;
    if (root.val % 2 == 0) {
      if (root.left != null) {
        if (root.left.left != null) {
          temp += root.left.left.val;
        }
        if (root.left.right != null) {
          temp += root.left.right.val;
        }
      }
      if (root.right != null) {
        if (root.right.left != null) {
          temp += root.right.left.val;
        }
        if (root.right.right != null) {
          temp += root.right.right.val;
        }
      }
    }
    return temp + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
  }
}
