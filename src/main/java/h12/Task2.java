package h12;

import java.util.Arrays;

// https://leetcode.com/problems/relative-sort-array/
public class Task2 {

  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] arr3 = new int[arr1.length];
    int k = 0;

    for (int j = 0; j < arr2.length; j++) {
      int count = 0;

      for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] == arr2[j]) {
          count++;
        }
      }

      int x = 0;
      while (x < count) {
        arr3[k] = arr2[j];
        k++;
        x++;
      }
    }

    int[] remaining = new int[arr1.length - k];
    int r = 0;

    for (int i = 0; i < arr1.length; i++) {
      boolean found = false;

      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
          found = true;
          break;
        }
      }

      if (!found) {
        remaining[r] = arr1[i];
        r++;
      }
    }

    Arrays.sort(remaining);

    for (int i = 0; i < remaining.length; i++) {
      arr3[k] = remaining[i];
      k++;
    }

    return arr3;
  }
}
