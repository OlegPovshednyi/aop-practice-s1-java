package h1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task2test {
  @Test
  void countOdds() {
    Task2 task = new Task2();

    assertEquals(3, task.countOdds(3, 7));
    assertEquals(1, task.countOdds(8, 10));
    assertEquals(5, task.countOdds(1, 10));
    assertEquals(4, task.countOdds(2, 9));
  }
}
