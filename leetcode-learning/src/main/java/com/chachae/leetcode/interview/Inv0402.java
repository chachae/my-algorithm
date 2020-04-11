package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/minimum-height-tree-lcci/
 *
 * @author chachae
 * @since 2020/4/11 17:10
 */
public class Inv0402 {


  @Test
  public void test() {
    TreeNode node = sortedArrayToBST(new int[]{-3, 0, 5, 9});
    node.preOrderNR();
  }

  public TreeNode sortedArrayToBST(int[] nums) {
    return add(nums, 0, nums.length);
  }

  private TreeNode add(int[] nums, int left, int right) {
    if (left == right) {
      return null;
    }
    int mid = left + (right - left) / 2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = add(nums, left, mid);
    node.right = add(nums, mid + 1, right);
    return node;
  }
}
