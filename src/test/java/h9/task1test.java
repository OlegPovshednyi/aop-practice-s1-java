package h9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task1test {
  @Test
  void testtask1() {
    Task1 task1 = new Task1();

    assertEquals(4, task1.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3}));

    assertEquals(6, task1.numIdenticalPairs(new int[] {1, 1, 1, 1}));

    assertEquals(0, task1.numIdenticalPairs(new int[] {1, 2, 3, 4}));

    assertEquals(1, task1.numIdenticalPairs(new int[] {1, 1}));

    assertEquals(0, task1.numIdenticalPairs(new int[] {1}));

    assertEquals(3, task1.numIdenticalPairs(new int[] {1, 2, 1, 2}));

    assertEquals(10, task1.numIdenticalPairs(new int[] {5, 5, 5, 5, 5}));
  }
}
