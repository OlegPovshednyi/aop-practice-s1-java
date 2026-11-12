package h5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class task2test {
  @Test
  void tsettask2() {

    Task2 task2 = new Task2();

    assertArrayEquals(
        new int[] {0, 1, 9, 16, 100}, task2.sortedSquares(new int[] {-4, -1, 0, 3, 10}));

    assertArrayEquals(
        new int[] {4, 9, 9, 49, 121}, task2.sortedSquares(new int[] {-7, -3, 2, 3, 11}));

    assertArrayEquals(new int[] {0}, task2.sortedSquares(new int[] {0}));

    assertArrayEquals(new int[] {1}, task2.sortedSquares(new int[] {-1}));

    assertArrayEquals(new int[] {1, 4, 9, 16}, task2.sortedSquares(new int[] {-4, -3, -2, -1}));

    assertArrayEquals(new int[] {1, 4, 9, 16}, task2.sortedSquares(new int[] {1, 2, 3, 4}));

    assertArrayEquals(new int[] {0, 0, 1, 1}, task2.sortedSquares(new int[] {-1, 0, 0, 1}));
  }
}
