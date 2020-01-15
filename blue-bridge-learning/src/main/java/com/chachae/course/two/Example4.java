package com.chachae.course.two;

/**
 * @author chachae
 * @since 2020/1/15 10:35
 */
public class Example4 {
  // 遍历所有情况
  public static void fun(String v, int n) {
    if (n == 9) { // 修改完最后一位符号时输出
      check(v);
    } else { // 递归向后修改，数字 变为 数字加符号
      fun(v.replace(n + "", n + "+"), n + 1);
      fun(v.replace(n + "", n + "-"), n + 1);
      fun(v, n + 1);
    }
  }
  // 验证 并 输出
  public static void check(String str) {
    String[] add = str.split("\\+");
    int sum = 0;
    for (String t : add) {
      String[] sub = t.split("-");
      int num = Integer.parseInt(sub[0]);
      // 计算负数
      for (int i = 1; i < sub.length; i++) {
        num -= Integer.parseInt(sub[i]);
      }
      sum += num; // 正数或负数结果 加到 总和上
    }
    if (sum == 110) {
      System.out.println(str);
    }
  }

  public static void main(String[] args) {
    String str = "123456789";
    fun(str, 1); // 调用函数，从1开始修改
  }
}
