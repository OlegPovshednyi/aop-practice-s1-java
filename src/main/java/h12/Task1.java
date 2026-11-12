package h12;

import java.util.Arrays;

// https://leetcode.com/problems/height-checker/
public class Task1 {
  public int heightChecker(int[] heights) {
    int count = 0;
    int[] expected = heights.clone();
    Arrays.sort(expected);
    for (int i = 0; i < heights.length; i++) {
      if (heights[i] != expected[i]) {
        count++;
      }
    }
    return count;
  }
}
