package com.chachae.course.four;

import org.junit.jupiter.api.Test;

/**
 * 第1个素数是2，第2个素数是3，... 求第100002（十万零二）个素数
 *
 * @author chachae
 * @since 2020/1/15 17:07
 */
public class Example2 {

  public boolean pk(int n) {

    if (n == 2 || n == 3 || n == 5) {
      return true;
    }

    if (n % 2 == 0) {
      return false;
    }

    if (n % 3 == 0) {
      return false;
    }

    if (n % 4 == 0) {
      return false;
    }

    if (n % 5 == 0) {
      return false;
    }

    if (n % 6 == 0) {
      return false;
    }

    if (n % 8 == 0) {
      return false;
    }

    if (n % 9 == 0) {
      return false;
    }

    if (n % 10 == 0) {
      return false;
    }

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  @Test
  public void test() {

    int i = 0;
    int k = 2;
    while (i < 100002) {
      if (pk(k)) {
        i++;
        System.out.println("第" + i + "个素数是：" + k);
      }
      k++;
    }
  }
}
