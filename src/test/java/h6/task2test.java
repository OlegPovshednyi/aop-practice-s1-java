package h6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task2test {
  @Test
  void testtask2() {
    Task2 task2 = new Task2();

    assertTrue(task2.isPalindrome("A man, a plan, a canal: Panama"));

    assertFalse(task2.isPalindrome("race a car"));

    assertTrue(task2.isPalindrome(" "));

    assertTrue(task2.isPalindrome("a"));

    assertTrue(task2.isPalindrome("12321"));

    assertFalse(task2.isPalindrome("12345"));

    assertTrue(task2.isPalindrome("Aa"));

    assertTrue(task2.isPalindrome(".,!"));
  }
}
