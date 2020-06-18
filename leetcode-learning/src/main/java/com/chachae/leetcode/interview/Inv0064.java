package com.chachae.leetcode.interview;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/6/17 23:02
 */
public class Inv0064 {

  public int sumNums(int n) {
    int sum = n;
    boolean flag = n > 0 && (sum += sumNums(n - 1)) > 0;
    return sum;
  }

  @Test
  public void test(){
    System.out.println(sumNums(3));
  }

}
