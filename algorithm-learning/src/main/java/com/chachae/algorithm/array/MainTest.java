package com.chachae.algorithm.array;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/1/5 10:54
 */
public class MainTest {

  @Test
  public void testMyArray() {
    MyArray myArray = new MyArray(20);
    for (int i = 0; i < 10; i++) {
      myArray.addLast(i);
    }
    System.out.println(myArray);
    myArray.add(1, 100);
    System.out.println(myArray);
    myArray.addFirst(-1);
    System.out.println(myArray);
    myArray.set(1, 200);
    System.out.println(myArray);
    myArray.remove(2);
    System.out.println(myArray);
    myArray.removeElement(4);
    System.out.println(myArray);
    myArray.removeFirst();
    System.out.println(myArray);
  }

  @Test
  public void testGenericArray() {
    GenericArray<String> genericArray = new GenericArray<>(20);
    for (int i = 0; i < 15; i++) {
      genericArray.addLast(String.valueOf(i));
    }
    System.out.println(genericArray);
    genericArray.add(1, "100");
    System.out.println(genericArray);
    genericArray.addFirst("Hello");
    System.out.println(genericArray);
  }

  @Test
  public void testStudent() {
    GenericArray<Student> array = new GenericArray<>();
    array.addLast(new Student("Joe", 100));
    array.addLast(new Student("Alice", 99));
    array.addLast(new Student("Sue", 98));
    System.out.println(array);
  }

  @Test
  public void testDynamicArray() {
    DynamicArray<Integer> myArray = new DynamicArray<>(5);
    for (int i = 0; i < 5; i++) {
      myArray.addLast(i);
    }
    System.out.println(myArray);
    myArray.add(1, 100);
    System.out.println(myArray);
    myArray.addFirst(-1);
    System.out.println(myArray);
    myArray.remove(2);
    System.out.println(myArray);
    myArray.removeElement(4);
    System.out.println(myArray);
    myArray.removeFirst();
    System.out.println(myArray);
  }
}
