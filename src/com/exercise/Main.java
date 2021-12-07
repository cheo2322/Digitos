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
    double value = Math.pow(3 + Math.sqrt(5), n);
    int floor = (int) Math.floor(value);
    String number = String.valueOf(floor);

    if (floor >= 100) {
      return number.substring(number.length() - 3);
    }

    while (number.length() < 3) {
      number = "0".concat(number);
    }
    return number;
  }
}
