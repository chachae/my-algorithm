package com.chachae.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/ 给定数组 nums = [1,1,2],
 * <p>
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author chachae
 * @version v1.0
 * @date 2020/6/18 18:30
 */
public class No0026 {

  public int removeDuplicates(int[] nums) {

    if (nums.length <= 0) {
      return nums.length;
    }

    int slow = 0, size = 1;
    for (int i = 0; i < nums.length; i++) {

      if (nums[i] != nums[slow]) {
        nums[++slow] = nums[i];
        size++;
      }

    }
    return size;
  }

  public static void main(String[] args) {
    System.out.println(new No0026().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
  }

}
