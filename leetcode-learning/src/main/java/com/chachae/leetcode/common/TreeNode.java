package com.chachae.leetcode.common;

import java.util.Stack;

/**
 * @author chachae
 * @since 2020/4/11 17:07
 */
public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
  }

  /**
   * 前序遍历（非递归方法）
   */
  public void preOrderNR() {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(this);
    while (!stack.isEmpty()) {
      TreeNode cur = stack.pop();
      System.out.printf("%s\t", cur.val);
      if (cur.right != null) {
        stack.push(cur.right);
      }
      if (cur.left != null) {
        stack.push(cur.left);
      }
    }
  }
}

