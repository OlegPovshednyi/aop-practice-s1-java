package h2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task1test {
  @Test
  void testTask1() {
    Task1 task1 = new Task1();
    assertEquals(4, task1.addDigits(4));
    assertEquals(1, task1.addDigits(20));
    assertEquals(2, task1.addDigits(400));
    assertEquals(2, task1.addDigits(444));
    assertEquals(2, task1.addDigits(0));
  }
}
