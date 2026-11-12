package h9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

public class task2test {
  @Test
  void testtask2() {

    Task2 task2 = new Task2();

    assertEquals(
        List.of(true, true, true, false, true),
        task2.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3));

    assertEquals(
        List.of(true, false, false, false, false),
        task2.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1));

    assertEquals(List.of(true, false, true), task2.kidsWithCandies(new int[] {12, 1, 12}, 10));

    assertEquals(List.of(true, true, true), task2.kidsWithCandies(new int[] {1, 1, 1}, 0));

    assertEquals(List.of(true), task2.kidsWithCandies(new int[] {5}, 0));

    assertEquals(List.of(true, true, true, true), task2.kidsWithCandies(new int[] {1, 2, 3, 4}, 3));
  }
}
