package com.chachae.leetcode.medium;

import com.chachae.leetcode.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/14 23:13
 */
public class No1302 {

  @Test
  public void test() {
    int[] es = new int[]{2, 3, 4, 5, 6, 7, 8};
    TreeNode node = new TreeNode(1);
    for (int e : es) {
      node.add(e);
    }
    // System.out.println(deepestLeavesSum(node));
    System.out.println(deepestLeavesSum2(node));
  }

  /**
   * 层序遍历
   */
  public int deepestLeavesSum(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    int sum = 0;
    queue.offer(root);
    while (!queue.isEmpty()) {
      sum = 0;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode poll = queue.poll();
        sum += poll.val;
        if (poll.left != null) {
          queue.offer(poll.left);
        }
        if (poll.right != null) {
          queue.offer(poll.right);
        }
      }
    }
    return sum;
  }

  /**
   * 深度优先
   */
  int maxDeep = -1;
  int total = 0;

  public void dfs(TreeNode node, int deep) {
    if (node == null) {
      return;
    }
    if (deep > maxDeep) {
      maxDeep = deep;
      total = node.val;
    } else if (deep == maxDeep) {
      total += node.val;
    }
    dfs(node.left, ++deep);
    dfs(node.right, ++deep);
  }

  public int deepestLeavesSum2(TreeNode root) {
    dfs(root, 0);
    return total;
  }

}
