package com.chachae.course.one;

/**
 * 古罗马帝国开创了辉煌的人类文明，但他们的数字表示法的确有些繁琐，尤其在表示大数的时候，现在看起来简直不能忍受，所以在现代很少使用了。
 *
 * <p>之所以这样，不是因为发明表示法的人的智力的问题，而是因为一个宗教的原因，当时的宗教禁止在数字中出现0的概念！
 *
 * <p>罗马数字的表示主要依赖以下几个基本符号：
 *
 * <p>I --> 1 V --> 5 X --> 10 L --> 50 C --> 100 D --> 500 M --> 1000
 *
 * <p>这里，我们只介绍一下1000以内的数字的表示法。 单个符号重复多少次，就表示多少倍。最多重复3次。
 *
 * <p>比如：CCC表示300 XX表示20，但150并不用LLL表示，这个规则仅适用于I X C M。
 *
 * <p>如果相邻级别的大单位在右，小单位在左，表示大单位中扣除小单位。 比如：IX表示9 IV表示4 XL表示40 49 = XLIX
 *
 * <p>更多的示例参见下表，你找到规律了吗？ I = 1 II = 2 III = 3 IV = 4 V = 5 VI = 6 VII = 7 VIII = 8 IX = 9 X = 10 XI
 * = 11 XII = 12 XIII = 13 XIV = 14 XV = 15 XVI = 16 XVII = 17 XVIII = 18 XIX = 19 XX = 20 XXI = 21
 * XXII = 22 XXIX = 29 XXX = 30 XXXIV = 34 XXXV = 35 XXXIX = 39 XL = 40 L = 50 LI = 51 LV = 55 LX =
 * 60 LXV = 65 LXXX = 80 XC = 90 XCIII = 93 XCV = 95 XCVIII = 98 XCIX = 99 C = 100 CC = 200 CCC =
 * 300 CD = 400 D = 500 DC = 600 DCC = 700 DCCC = 800 CM = 900 CMXCIX = 999
 *
 * <p>本题目的要求是：请编写程序，由用户输入若干个罗马数字串，程序输出对应的十进制表示。
 *
 * <p>输入格式是：第一行是整数n,表示接下来有n个罗马数字(n<100)。
 *
 * <p>以后每行一个罗马数字。罗马数字大小不超过999。 要求程序输出n行，就是罗马数字对应的十进制数据。
 *
 * <p>例如，用户输入： 3 LXXX XCIII DCCII
 *
 * <p>则程序应该输出： 80 93 702
 *
 * @author chachae
 * @since 2020/1/9 11:50
 */
public class Example2 {

  public static int romeNum(String s) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == 'I') {
        sum += 1;
      }
      if (c == 'V') {
        sum += 5;
      }
      if (c == 'X') {
        sum += 10;
      }
      if (c == 'L') {
        sum += 50;
      }
      if (c == 'C') {
        sum += 100;
      }
      if (c == 'D') {
        sum += 500;
      }
      if (c == 'M') {
        sum += 1000;
      }
    }
    // 补偿
    if (s.indexOf("IV") >= 0) {
      sum -= 2;
    }
    if (s.indexOf("IX") >= 0) {
      sum -= 2;
    }
    if (s.indexOf("XL") >= 0) {
      sum -= 20;
    }
    if (s.indexOf("XC") >= 0) {
      sum -= 20;
    }
    if (s.indexOf("CD") >= 0) {
      sum -= 200;
    }
    if (s.indexOf("CM") >= 0) {
      sum -= 200;
    }

    return sum;
  }

  public static void main(String[] args) {
    System.out.println(romeNum("MCCCXIV"));
    System.out.println(romeNum("CMXCIX"));
  }
}
