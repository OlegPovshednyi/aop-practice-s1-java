package h10;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class task2test {
  @Test
  void testtask2() {
    Task2 task2 = new Task2();

    char[] arr1 = {'h', 'e', 'l', 'l', 'o'};
    task2.reverseString(arr1);
    assertArrayEquals(new char[] {'o', 'l', 'l', 'e', 'h'}, arr1);

    char[] arr2 = {'H', 'a', 'n', 'n', 'a', 'h'};
    task2.reverseString(arr2);
    assertArrayEquals(new char[] {'h', 'a', 'n', 'n', 'a', 'H'}, arr2);

    // Один символ
    char[] arr3 = {'a'};
    task2.reverseString(arr3);
    assertArrayEquals(new char[] {'a'}, arr3);

    // Два символи
    char[] arr4 = {'a', 'b'};
    task2.reverseString(arr4);
    assertArrayEquals(new char[] {'b', 'a'}, arr4);

    // Однакові символи
    char[] arr5 = {'x', 'x', 'x', 'x'};
    task2.reverseString(arr5);
    assertArrayEquals(new char[] {'x', 'x', 'x', 'x'}, arr5);

    // Порожній масив
    char[] arr6 = {};
    task2.reverseString(arr6);
    assertArrayEquals(new char[] {}, arr6);
  }
}
