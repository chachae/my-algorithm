package com.chachae.leetcode.medium;

import com.chachae.leetcode.common.TreeNode;
import java.util.Set;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/13 14:37
 */
public class No0230 {

  @Test
  public void test() {
    TreeNode node = new TreeNode(5);
    int[] e = new int[]{50, 43, 46, 32, 24, 31, 30, 23, 27, 30, 29, 39, 18, 10, 6, 20, 4, 5, 4, 6,
        3, 9, 2, 1, -1, 71,
        3};
    for (int i : e) {
      node.add(i);
    }
    System.out.println(kthSmallest(node, 3));
  }

  public int kthSmallest(TreeNode root, int k) {
    Set<Integer> res = new TreeSet<>();
    mini(root, res);
    Object[] objects = res.toArray();
    return (int) objects[k - 1];
  }

  private TreeNode mini(TreeNode root, Set<Integer> set) {
    if (root == null) {
      return null;
    }
    if (root.left == null) {
      return root;
    } else {
      set.add(root.left.val);
    }
    return mini(root.left, set);
  }
}
