package com.chachae.course.one.question3;

import java.util.Scanner;

/**
 * @author chachae
 * @since 2020/2/3 11:41
 */
public class Main3 {

  private static boolean vio(String all, String n) {
    for (int i = 0; i < all.length(); i++) {
      if (all.charAt(i) == n.charAt(i) || n.charAt(i) == '0') {
        continue;
      }
      return false;
    }
    return true;
  }

  public static void main(String[] args) {

    String[] all = {
      "492357816",
      "834159672",
      "618753294",
      "276951438",
      "294753618",
      "438951276",
      "816357492",
      "672159834"
    };

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 9; i++) {
      sb.append(sc.nextInt());
    }

    int count = 0;
    String result = null;

    for (String str : all) {
      if (vio(str, sb.toString())) {
        count++;
        if (count == 0 || count == 1) {
          result = str;
        }
      }
    }

    if (count > 1) {
      System.out.println("Too many");
    } else {
      assert result != null;
      System.out.println(result.charAt(0) + " " + result.charAt(1) + " " + result.charAt(2));
      System.out.println(result.charAt(3) + " " + result.charAt(4) + " " + result.charAt(5));
      System.out.println(result.charAt(6) + " " + result.charAt(7) + " " + result.charAt(8));
    }
  }
}
