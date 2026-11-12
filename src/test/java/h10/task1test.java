package h10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task1test {

  @Test
  void testtask1() {

    Task1 task1 = new Task1();

    assertEquals('a', task1.kthCharacter(1));
    assertEquals('b', task1.kthCharacter(2));
    assertEquals('b', task1.kthCharacter(3));
    assertEquals('c', task1.kthCharacter(4));
    assertEquals('b', task1.kthCharacter(5));
    assertEquals('c', task1.kthCharacter(6));
    assertEquals('c', task1.kthCharacter(7));
    assertEquals('d', task1.kthCharacter(8));
    assertEquals('b', task1.kthCharacter(9));
    assertEquals('c', task1.kthCharacter(10));
  }
}
