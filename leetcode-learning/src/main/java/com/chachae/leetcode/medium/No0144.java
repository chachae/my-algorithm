package com.chachae.leetcode.medium;

import com.chachae.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/12 23:29
 */
public class No0144 {

  @Test
  public void test() {
    TreeNode node = new TreeNode(1);
    int[] e = new int[]{2, 3};
    for (int i : e) {
      node.add(i);
    }
    System.out.println(preorderTraversal(node));
  }


  public List<Integer> preorderTraversal(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }
    List<Integer> res = new ArrayList<>();
    return pre(root, res);
  }

  private List<Integer> pre(TreeNode root, List<Integer> res) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode cur = stack.pop();
      res.add(cur.val);
      if (cur.right != null) {
        stack.push(cur.right);
      }
      if (cur.left != null) {
        stack.push(cur.left);
      }
    }
    return res;
  }

  public List<Integer> preorderTraversal2(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    doInorderTraversal(result, root);
    return result;
  }

  private void doInorderTraversal(List<Integer> res, TreeNode root) {
    if (root == null) {
      return;
    }
    res.add(root.val);
    doInorderTraversal(res, root.left);
    doInorderTraversal(res, root.right);
  }
}
