package com.chachae.course.one.question4;

/**
 * @author chachae
 * @since 2020/2/3 12:24
 */
public class Main4 {

  static int[][] transx = {{0, 1, 2, 3}, {4, 21, 14, 19}, {7, 20, 13, 18}};
  static int[][] transy = {{4, 5, 6, 7}, {1, 17, 11, 21}, {2, 18, 8, 22}};
  static int[][] transz = {{16, 17, 18, 19}, {0, 12, 8, 4}, {1, 13, 9, 5}};

  static char[] op(char[] a, int[][] trans) {
    char[] b = java.util.Arrays.copyOf(a, a.length);

      for (int[] tran : trans) {
          b[tran[1]] = a[tran[0]];
          b[tran[2]] = a[tran[1]];
          b[tran[3]] = a[tran[2]];
          b[tran[0]] = a[tran[3]];
      }
    return b;
  }

  static char[] op(char[] a) {
    char[] b = java.util.Arrays.copyOf(a, a.length);
    for (int i = 0; i < "x".length(); i++) {
        b = op(b, transx);
    }
    return b;
  }

  public static void main(String[] args) {
    char[] init = {
      '绿', '绿', '绿', '绿', '红', '红', '红', '红', '蓝', '蓝', '蓝', '蓝', '橙', '橙', '橙', '橙', '白', '白', '白',
      '白', '黄', '黄', '黄', '黄',
    };

    // char[] b = op(init, "xyxyzzxyxyzz");
    char[] b = op(init);
    System.out.println("" + b[1] + b[4] + b[18]);
  }
}
