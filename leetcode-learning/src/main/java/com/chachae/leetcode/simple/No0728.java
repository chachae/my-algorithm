package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/self-dividing-numbers/submissions/"></a>
 *
 * @author chachae
 * @since 2020/1/5 16:37
 */
public class No0728 {

  private boolean dg(int n) {
    int first = n;
    while (n > 0) {
      int a = n % 10;
      if (a == 0) {
        return false;
      }
      if (first % a == 0) {
        n = n / 10;
      } else {
        return false;
      }
    }
    return true;
  }

  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> data = new ArrayList<>();
    for (int i = left; i <= right; i++) {
      if (dg(i)) {
        data.add(i);
      }
    }
    return data;
  }

  @Test
  public void test() {
    System.out.println(selfDividingNumbers(1, 10000));
  }
}
