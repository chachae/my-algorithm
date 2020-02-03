package com.chachae.course.two.practice;

/**
 * 翻转字符串
 *
 * @author chachae
 * @since 2020/2/3 20:44
 */
public class Test2 {

  /**
   * 判断回文数
   */
  public static boolean isPalindrome(String s) {
    return s.equals(reverse(s));
  }

  public static void main(String[] args) {
    System.out.println(reverse("ABC"));
    System.out.println(isPalindrome("ABC22233222CBA"));
  }

  static String reverse(String str) {
    if (str == null || str.length() == 1) {
      return str;
    } else {
      return reverse(str.substring(1)) + str.charAt(0);
    }
  }
}
