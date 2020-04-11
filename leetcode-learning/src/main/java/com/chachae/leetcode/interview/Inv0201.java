package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.ListNode;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/11 18:52
 */
public class Inv0201 {

  @Test
  public void test() {
    System.out.println(removeDuplicateNodes(new ListNode(new int[]{1, 2, 3, 3, 2, 1})));
  }


  public ListNode removeDuplicateNodes(ListNode head) {
    Set<Integer> set = new HashSet<>();
    ListNode temp = head, pre = temp;
    while (temp != null) {
      if (set.add(temp.val)) {
        pre = temp;
      } else {
        pre.next = temp.next;
      }
      temp = temp.next;
    }
    return head;
  }
}
