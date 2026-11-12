package h4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task2test {

  @Test
  void testatsk2() {

    Task2 task2 = new Task2();

    assertEquals(2, task2.findComplement(5));
    assertEquals(0, task2.findComplement(1));
    assertEquals(0, task2.findComplement(7));
    assertEquals(5, task2.findComplement(10));
    assertEquals(1, task2.findComplement(2));
    assertEquals(4, task2.findComplement(3));
    assertEquals(3, task2.findComplement(4));
    assertEquals(8, task2.findComplement(23));
  }
}
