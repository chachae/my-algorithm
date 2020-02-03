package com.chachae.course.three.question2;

/**
 * @author chachae
 * @since 2020/2/3 16:53
 */
public class Main {

  static int count = 0;

  public static void main(String[] args) {
    String str = "0123456789";
    f(str.toCharArray(), 0);
    System.out.println(count);
  }

  static void f(char[] s, int start) {
    // 出口
    if (start == s.length - 1) {
      // 所有条件
      boolean a = s[0] < s[1] && s[0] < s[2];
      boolean b = s[1] < s[3] && s[1] < s[4];
      boolean c = s[2] < s[4] && s[2] < s[5];
      boolean d = s[3] < s[6] && s[3] < s[7];
      boolean e = s[4] < s[7] && s[4] < s[8];
      boolean f = s[5] < s[8] && s[5] < s[9];
      if (a && b && c && d && e && f) {
        count++;
      }
    }

    for (int i = start; i < s.length; i++) {
      swap(s, i, start);
      f(s, start + 1);
      // 回溯
      swap(s, i, start);
    }
  }

  static void swap(char[] c, int i, int k) {
    char temp = c[i];
    c[i] = c[k];
    c[k] = temp;
  }
}
