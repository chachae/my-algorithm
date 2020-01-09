package com.chachae.course.one;

/**
 * @author chachae
 * @since 2020/1/9 15:09
 */
public class Example3 {
  static boolean test(String std, String s) {
    for (int i = 0; i < std.length(); i++) {
      if (std.charAt(i) == s.charAt(i)) {
        continue;
      }
      if (s.charAt(i) == '0') {
        continue;
      }
      return false;
    }
    return true;
  }

  public static void main(String[] args) {

    String s = "072050030";

    String[] ss = {
      "492357816",
      "834159672",
      "618753294",
      "276951438",
      "294753618",
      "438951276",
      "816357492",
      "672159834"
    };

    for (String value : ss) {
      if (test(value, s)) {
        System.out.println(value.substring(0, 3));
        System.out.println(value.substring(3, 6));
        System.out.println(value.substring(6, 9));
      }
    }
  }
}
