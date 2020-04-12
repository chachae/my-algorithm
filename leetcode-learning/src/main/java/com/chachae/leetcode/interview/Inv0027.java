package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 *
 * @author chachae
 * @since 2020/4/12 23:47
 */
public class Inv0027 {

  @Test
  public void test() {
    TreeNode node = new TreeNode(4);
    int[] es = new int[]{2, 7, 1, 3, 6, 9};
    for (int e : es) {
      node.add(e);
    }
    node.preOrderNR();
    System.out.println();
    buildMirror(node).preOrderNR();
  }

  public TreeNode mirrorTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    TreeNode tmpNode = root.left;
    root.left = mirrorTree(root.right);
    root.right = mirrorTree(tmpNode);
    return root;
  }

  public TreeNode buildMirror(TreeNode root) {
    if (root == null) {
      return null;
    }
    buildMirror(root.left);
    buildMirror(root.right);
    TreeNode tmp = root.left;
    root.left = root.right;
    root.right = tmp;
    return root;
  }
}
