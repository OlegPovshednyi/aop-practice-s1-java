package h16;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class task1test {

  @Test
  void testtask1() {
    Task1 task1 = new Task1();


    int[][] image1 = {
      {1, 1, 1},
      {1, 1, 0},
      {1, 0, 1}
    };

    int[][] expected1 = {
      {2, 2, 2},
      {2, 2, 0},
      {2, 0, 1}
    };

    assertArrayEquals(expected1, task1.floodFill(image1, 1, 1, 2));


    int[][] image2 = {
      {0, 0, 0},
      {0, 0, 0},
      {0, 0, 1}
    };

    int[][] expected2 = {
      {0, 0, 0},
      {0, 0, 0},
      {0, 0, 1}
    };

    assertArrayEquals(expected2, task1.floodFill(image2, 0, 0, 0));


    int[][] image3 = {
      {1, 1, 1},
      {1, 1, 0},
      {1, 0, 1}
    };

    int[][] expected3 = {
      {2, 2, 2},
      {2, 2, 0},
      {2, 0, 1}
    };

    assertArrayEquals(expected3, task1.floodFill(image3, 0, 0, 2));
  }
}
