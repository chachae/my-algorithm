package com.chachae.leetcode.simple;

import com.chachae.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/11 22:25
 */
public class No0141 {

  @Test
  public void test(){
    ListNode node = new ListNode(new int[]{3,2,0,-4});
    System.out.println(hasCycle(node));
  }

  public boolean hasCycle(ListNode head) {
    if(head == null || head.next == null) {
      return false;
    }

    //   s   f
    // 3 2 0 4
    ListNode fast = head.next;
    ListNode slow = head;
    while(fast != slow){
      if(fast.next == null || fast.next.next == null) {
        return false;
      }
      fast = fast.next.next;
      slow = slow.next;
    }
    return true;
  }
}
