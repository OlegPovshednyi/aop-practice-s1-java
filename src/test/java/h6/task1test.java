package h6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task1test {

  @Test
  void testtask1() {

    Task1 task1 = new Task1();

    assertTrue(task1.isAnagram("anagram", "nagaram"));
    assertFalse(task1.isAnagram("rat", "car"));
    assertTrue(task1.isAnagram("hello", "hello"));
    assertFalse(task1.isAnagram("ab", "abc"));
    assertTrue(task1.isAnagram("a", "a"));
    assertFalse(task1.isAnagram("a", "A"));
    assertTrue(task1.isAnagram("", ""));
  }
}
