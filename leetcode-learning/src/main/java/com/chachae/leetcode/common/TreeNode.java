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

  public void add(int e) {
    add(this, e);
  }

  /**
   * 添加元素
   *
   * @param node 当前节点
   * @param e    元素
   * @return new TreeNode
   */
  private TreeNode add(TreeNode node, int e) {
    if (node == null) {
      return new TreeNode(e);
    }

    if (e < node.val) {
      node.left = add(node.left, e);
    } else if (e > node.val) {
      node.right = add(node.right, e);
    }

    return node;
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

