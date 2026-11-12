package h3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task1test {
  @Test
  void testTask1() {
    Task1 task1 = new Task1();
    assertEquals(2.5, task1.average(new int[] {1, 2, 3, 4}), 0.0001);
    assertEquals(3.0, task1.average(new int[] {100, 200, 300}), 0.0001);
    assertEquals(5.5, task1.average(new int[] {1, 5, 6, 10}), 0.0001);
    assertEquals(20.0, task1.average(new int[] {10, 20, 30}), 0.0001);
  }
}
