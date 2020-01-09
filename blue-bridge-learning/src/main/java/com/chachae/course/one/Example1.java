package com.chachae.course.one;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * 美国数学家维纳(N.Wiener)智力早熟，11岁就上了大学。 他曾在1935~1936年应邀来中国清华大学讲学。
 *
 * <p>一次，他参加某个重要会议，年轻的脸孔引人注目。 于是有人询问他的年龄，他回答说：
 *
 * <p>“我年龄的立方是个4位数。我年龄的4次方是个6位数。这10个数字正好包含了从0到9这10个数字，
 *
 * <p>每个都恰好出现1次。” 请你推算一下，他当时到底有多年轻。
 *
 * @author chachae
 * @since 2020/1/9 11:24
 */
public class Example1 {

  @Test
  public void test() {
    System.out.println(getAge());
  }

  public int getAge() {
    int age = 18;
    int max = 21;
    // 11^3 = 1221 21^3 = 9261
    // 18^4 = 104976 21^4 = 194481
    // 年龄范围：18-21
    while (age <= max) {
      Set<Character> set = new HashSet<>();
      for (char c : String.valueOf((int) Math.pow(age, 3)).toCharArray()) {
        set.add(c);
      }
      for (char c : String.valueOf((int) Math.pow(age, 4)).toCharArray()) {
        set.add(c);
      }
      if (set.size() == 10) {
        return age;
      }
      age++;
    }
    return 0;
  }

  public void getAge2() {
    for (int i = 1; i < 100; i++) {
      int a = i * i * i;
      int b = a * i;
      if ((a + "").length() != 4) {
        continue;
      }
      if ((b + "").length() != 6) {
        continue;
      }
      System.out.println(i + " = " + a + " " + b);
    }
  }
}
