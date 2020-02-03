package com.chachae.course.three.question1;

/**
 * @author chachae
 * @since 2020/2/3 17:29
 */
public class Main {
  public static void main(String[] args) {
    String str = "ABC";
    f(str.toCharArray(), 0);
  }

  public static void f(char[] array, int start) {
    if (start == array.length - 1) {
      System.out.println(array);
    } else {
      for (int i = start; i < array.length; i++) {
        // 1，2，3的全排列这块相当于将其中一个提了出来，下次递归从start+1开始
        swap(array, start, i);
        f(array, start + 1);
        // 这块是复原数组，为了保证下次另外的同级递归使用数组不会出错
        // 这块可以通过树来理解，每次回退一步操作，交换回去
        swap(array, start, i);
      }
    }
  }

  public static void swap(char[] array, int i, int j) {
    char temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
