package com.chachae.course.one.question1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author chachae
 * @since 2020/2/3 11:15
 */
public class Main {

  /**
   * min：18^3 = 5832、18^4=104976<br>
   * max：21^3=9261、21^4=194481
   */
  public static void main(String[] args) {

    for (int i = 18; i <= 21; i++) {
      String a = String.valueOf((int) Math.pow(i, 3));
      String b = String.valueOf((int) Math.pow(i, 4));
      char[] chars = (a + b).toCharArray();

      Set<Character> set = new HashSet<>();
      for (Character c : chars) {
        set.add(c);
      }

      if (set.size() == 10) {
        System.out.println(i);
        break;
      }
    }
  }
}
