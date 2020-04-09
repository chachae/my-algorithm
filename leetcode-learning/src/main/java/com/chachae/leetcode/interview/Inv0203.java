package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/9 18:34
 */
public class Inv0203 {

  @Test
  public void test() {
    deleteNode(new ListNode(new int[]{1, 2, 3, 4, 5}));
  }

  public void deleteNode(ListNode node) {
    node.val=node.next.val;
    node.next=node.next.next;
  }
}
