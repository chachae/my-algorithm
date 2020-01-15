package com.chachae.course.two;

import org.junit.jupiter.api.Test;

/**
 * X星球特别讲究秩序，所有道路都是单行线。 一个甲壳虫车队，共16辆车，按照编号先后发车，夹在其它车流中，缓缓前行。
 *
 * <p>路边有个死胡同，只能容一辆车通过，是临时的检查站，如图所示。 X星球太死板，要求每辆路过的车必须进入检查站，也可能不检查就放行，也可能仔细检查。
 * 如果车辆进入检查站和离开的次序可以任意交错。那么，该车队再次上路后，可能的次序有多少种？
 *
 * <p>为了方便起见，假设检查站可容纳任意数量的汽车。 显然，如果车队只有1辆车，可能次序1种；2辆车可能次序2种；3辆车可能次序5种。
 *
 * @author chachae
 * @since 2020/1/15 10:14
 */
public class Example3 {

  // out:栈外车 in:栈内车
  int f(int out, int in) {

    if (out == 0) {
      return 1;
    }

    if (in == 0) {
      return f(out - 1, 1);
    }

    return f(out - 1, in + 1) + f(out, in - 1);
  }

  // i:次序
  int f(int i) {
    return f(i, 0);
  }

  @Test
  public void test() {

    for (int i = 1; i <= 17; i++) {

      System.out.println(i + ":" + f(i));
    }
  }
}
