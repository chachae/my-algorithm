package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.Node;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 *
 * @author chachae
 * @since 2020/4/17 10:40
 */
public class No0590 {

  @Test
  public void test() {
  }

  List<Integer> res = new LinkedList<>();

  public List<Integer> postorder(Node root) {
    rev(root);
    return res;
  }

  public void rev(Node root) {
    if (root == null) {
      return;
    }
    for (Node temp : root.children) {
      rev(temp);
    }
    res.add(root.val);
  }
}
