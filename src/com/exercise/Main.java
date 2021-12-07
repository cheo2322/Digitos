package com.exercise;

public class Main {

  public static void main(String[] args) {
    int n = 2;
    System.out.println(threeDigits(n));
    if (!threeDigits(n).equals("027")) {
      throw new AssertionError();
    }

    n = 5;
    System.out.println(threeDigits(n));
    if (!threeDigits(n).equals("935")) {
      throw new AssertionError();
    }
  }

  private static String threeDigits(int n) {
    int value = (int) Math.pow(3 + Math.sqrt(5), n);
    String stringNumber = String.valueOf(value);

    if (value >= 100) {
      return stringNumber.substring(stringNumber.length() - 3);
    }

    while (stringNumber.length() < 3) {
      stringNumber = "0".concat(stringNumber);
    }
    return stringNumber;
  }
}
