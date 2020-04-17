package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 *
 * @author chachae
 * @since 2020/4/17 11:14
 */
public class No0108 {

  public void test() {
  }

  public TreeNode sortedArrayToBST(int[] nums) {
    // 左右等分建立左右子树，中间节点作为子树根节点，递归该过程
    return nums == null ? null : buildTree(nums, 0, nums.length - 1);
  }

  private TreeNode buildTree(int[] nums, int l, int r) {
    if (l > r) {
      return null;
    }
    int m = l + (r - l) / 2;
    TreeNode root = new TreeNode(nums[m]);
    root.left = buildTree(nums, l, m - 1);
    root.right = buildTree(nums, m + 1, r);
    return root;
  }
}
