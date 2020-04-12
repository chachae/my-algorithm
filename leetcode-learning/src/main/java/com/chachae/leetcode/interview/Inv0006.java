package com.chachae.leetcode.interview;

import com.chachae.leetcode.common.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 *
 * @author chachae
 * @since 2020/4/12 17:06
 */
public class Inv0006 {

  @Test
  public void test() {
    ListNode node = new ListNode(new int[]{1, 2, 3});
    System.out.println(Arrays.toString(reversePrint(node)));
  }

  public int[] reversePrint(ListNode head) {
    int len = 0;
    ListNode cur = head, pre = null, temp;
    while (cur != null) {
      temp = cur.next;
      cur.next = pre;
      pre = cur;
      cur = temp;
      len++;
    }

    int[] res = new int[len];
    for (int i = 0; i < len; i++) {
      res[i] = pre.val;
      pre = pre.next;
    }

    return res;
  }
}
