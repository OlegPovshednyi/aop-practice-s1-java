package h12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task1test {

  @Test
  void testtask1() {
    Task1 task1 = new Task1();
    assertEquals(0, task1.heightChecker(new int[] {1, 2, 3, 4, 5}));
    assertEquals(4, task1.heightChecker(new int[] {5, 4, 3, 2, 1}));
    assertEquals(0, task1.heightChecker(new int[] {2, 2, 2, 2}));
    assertEquals(2, task1.heightChecker(new int[] {2, 1}));
  }
}
