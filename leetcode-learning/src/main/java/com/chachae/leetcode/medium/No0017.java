package com.chachae.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 *
 * @author chachae
 * @since 2020/4/15 14:18
 */
public class No0017 {

  public void test() {
    System.out.println(letterCombinations("23"));
  }

  private ArrayList<String> res;

  private final String[] letterMap = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations (String digits){
      res = new ArrayList<>();
      if ("".equals(digits)) {
        return res;
      }

      findCombination(digits, 0, "");
      return res;
    }

  private void findCombination(String digits, int index, String s) {
    if (index == digits.length()) {
      res.add(s);
      return;
    }

    char c = digits.charAt(index);
    String letters = letterMap[c - '0'];
    for (int i = 0; i < letters.length(); i++) {
      findCombination(digits, index + 1, s + letters.charAt(i));
    }
  }
}
