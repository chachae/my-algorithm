package com.chachae.leetcode.simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author chachae
 * @since 2020/4/8 21:40
 */
public class No1389 {

  @Test
  public void test() {
    int[] nums = new int[] {1}, index = new int[] {0};
    System.out.println(Arrays.toString(createTargetArray(nums, index)));
  }

  /**
   * 输入：nums = [0,1,2,3,4], index = [0,1,2,2,1] 输出：[0,4,1,3,2] 解释： nums index target 0 0 [0] 1 1
   * [0,1] 2 2 [0,1,2] 3 2 [0,1,3,2] 4 1 [0,4,1,3,2] [0,1,2,3,5,4]
   *
   * <p>来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/create-target-array-in-the-given-order
   * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
   */
  public int[] createTargetArray(int[] nums, int[] index) {
    int len = nums.length;
    int[] result = new int[len];
    for (int i = 0; i < len; i++) {
      // 索引对应或者比当前大
      if (index[i] >= i) {
        result[i] = nums[index[i]];
      }

      // 位移
      // 0 1 2 3 4
      // 0 1 2 2 1
      else if (index[i] < i) {
        for (int j = i; j > index[i]; j--) {
          result[j] = result[j - 1];
        }
        result[index[i]] = nums[i];
      }
    }
    return result;
  }
}
