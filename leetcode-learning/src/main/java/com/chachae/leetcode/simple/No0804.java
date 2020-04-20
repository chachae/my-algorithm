package com.chachae.leetcode.simple;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode-cn.com/problems/unique-morse-code-words/
 *
 * @author chachae
 * @since 2020/4/20 18:38
 */
public class No0804 {

  @Test
  public void test() {
  }

  private static final String[] map = {
      ".-",
      "-...",
      "-.-.",
      "-..",
      ".",
      "..-.",
      "--.",
      "....",
      "..",
      ".---",
      "-.-",
      ".-..",
      "--",
      "-.",
      "---",
      ".--.",
      "--.-",
      ".-.",
      "...",
      "-",
      "..-",
      "...-",
      ".--",
      "-..-",
      "-.--",
      "--.."
  };

  public int uniqueMorseRepresentations(String[] words) {
    if (words == null) {
      return 0;
    }
    Set<String> set = new HashSet<>();
    for (String s : words) {
      StringBuilder sb = new StringBuilder();
      for (char c : s.toCharArray()) {
        sb.append(map[c - 'a']);
      }
      set.add(sb.toString());
    }
    return set.size();
  }
}
