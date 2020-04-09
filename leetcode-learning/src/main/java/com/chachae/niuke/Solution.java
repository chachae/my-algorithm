package com.chachae.niuke;

import com.chachae.leetcode.common.ListNode;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/8 23:56
 */
public class Solution {


  @Test
  public void test2() {
    int[] n = new int[]{1, 2, 3, 4, 5};
    System.out.println(printListFromTailToHead(new ListNode(n)));
  }

  private ArrayList<Integer> list = new ArrayList<>();

  private ListNode rev(ListNode node) {

    if (node == null) {
      return null;
    }
    node.next = rev(node.next);
    list.add(node.val);
    return null;
  }

  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    rev(listNode);
    return list;
  }

  /**
   * 1 2 3
   * <p>
   * 23 3 null
   */


}
