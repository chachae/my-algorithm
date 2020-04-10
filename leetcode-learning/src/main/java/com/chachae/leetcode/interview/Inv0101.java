package com.chachae.leetcode.interview;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/4/10 19:13
 */
public class Inv0101 {

  @Test
  public void test() {
    System.out.println(isUnique("leetcode"));
  }

  public boolean isUnique(String astr) {

    Set<Character> set = new HashSet<>();
    char[] chars = astr.toCharArray();
    for (char n : chars) {
      set.add(n);
    }
    return set.size() == astr.length();
  }
}
