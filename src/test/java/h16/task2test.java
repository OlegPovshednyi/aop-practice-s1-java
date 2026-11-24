package h16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class task2test {

  @Test
  void testtask2() {
    Task2 task2 = new Task2();

    int[][] trust1 = {{1, 2}};
    assertEquals(2, task2.findJudge(2, trust1));

    int[][] trust2 = {
      {1, 3},
      {2, 3}
    };
    assertEquals(3, task2.findJudge(3, trust2));

    int[][] trust3 = {
      {1, 3},
      {2, 3},
      {3, 1}
    };
    assertEquals(-1, task2.findJudge(3, trust3));

    int[][] trust4 = {};
    assertEquals(1, task2.findJudge(1, trust4));

    int[][] trust5 = {};
    assertEquals(-1, task2.findJudge(3, trust5));
  }
}
