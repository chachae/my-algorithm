package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/16 21:37
 */
public class No1108 {

  @Test
  public void test(){
    System.out.println(defangIPaddr("255.100.50.0"));
  }

  public String defangIPaddr(String address) {
    return address.replace(".", "[.]");
  }
}
