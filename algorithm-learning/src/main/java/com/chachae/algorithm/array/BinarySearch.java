package com.chachae.algorithm.array;

/**
 * 二分搜索
 *
 * @author chachae
 * @version v1.0
 * @date 2020/6/18 17:03
 */
public class BinarySearch {

  public int binarySearch(int[] els, int e) {

    //1 2 3 4 5 6
    int left = 0, right = els.length - 1;
    while (left < right) {
      int mid = right - left;
      if (els[mid] == e) {
        return mid;
      } else if (els[mid] > e) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(
        new BinarySearch().binarySearch(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 12, 16, 19, 25}, 16));
  }

}
