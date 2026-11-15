package h13;

// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class Task2 {
  public int maximumCount(int[] nums) {
    int count = 0;
    int countNegative = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        count++;
      } else if (nums[i] < 0) {
        countNegative++;
      }
    }
    if (countNegative > count) {
      return countNegative;
    } else {
      return count;
    }
  }
}
