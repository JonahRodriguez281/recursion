package edu.cnm.deepdive;

public class Factorials {

  public static long computeRecursive(int value) throws IllegalArgumentException {
    if (value < 0) {
      throw new IllegalArgumentException();
    }
    return (value <= 1) ? 1 : (value * computeRecursive(value - 1));
  }

}
