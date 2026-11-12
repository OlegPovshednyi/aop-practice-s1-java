package h8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task2test {
  @Test
  void testtask2() {
    Task1 task1 = new Task1();

    assertEquals(3, task1.findMaxConsecutiveOnes(new int[] {1, 1, 1, 0, 1}));

    assertEquals(2, task1.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1}));

    assertEquals(0, task1.findMaxConsecutiveOnes(new int[] {0, 0, 0, 0}));

    assertEquals(4, task1.findMaxConsecutiveOnes(new int[] {1, 1, 1, 1}));

    assertEquals(1, task1.findMaxConsecutiveOnes(new int[] {1, 0, 1, 0, 1}));

    assertEquals(0, task1.findMaxConsecutiveOnes(new int[] {0}));

    assertEquals(1, task1.findMaxConsecutiveOnes(new int[] {1}));

    assertEquals(5, task1.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 1, 1, 1, 0}));
  }
}
