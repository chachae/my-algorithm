package com.chachae.leetcode.common;

import java.util.List;

/**
 * @author chachae
 * @since 2020/4/17 10:42
 */
public class Node {

  public int val;
  public List<Node> children;

  public Node() {
  }

  public Node(int val) {
    this.val = val;
  }

  public Node(int val, List<Node> children) {
    this.val = val;
    this.children = children;
  }
}
