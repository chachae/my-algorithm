package com.chachae.leetcode.common;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/12 9:56
 */
public class TreeNodeTest {

  @Test
  public void test() {
    testAdd();
  }

  private static void testAdd() {
    TreeNode bst = new TreeNode(4);
    int[] n = new int[]{5, 0, 10, -4, 3};
    for (int i : n) {
      bst.add(i);
    }
    bst.preOrderNR();
  }
}
