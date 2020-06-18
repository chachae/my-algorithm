package com.chachae.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/ 给定 nums =
 * [1,1,1,2,2,3],
 * <p>
 * 函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author chachae
 * @version v1.0
 * @date 2020/6/18 21:59
 */
public class No0080 {

  public int removeDuplicates(int[] nums) {

    if (nums.length <= 2) {
      return nums.length;
    }

    int slow = 2;

    for (int i = 2; i < nums.length; i++) {
      if (nums[slow] != nums[i - 2]) {
        nums[slow] = nums[i];
        slow++;
      }
    }
    return slow;
  }

  public static void main(String[] args) {
    System.out.println(new No0080().removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
  }
}
