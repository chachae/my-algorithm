package com.chachae.algorithm.array;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chachae
 * @since 2020/1/5 15:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

  private String fullName;
  private Integer score;

  @Override
  public String toString() {
    return String.format("Student (name: %s, student score: %s)", fullName, score);
  }
}
