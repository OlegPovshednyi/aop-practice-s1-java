package h6;

import java.util.Arrays;

// https://leetcode.com/problems/valid-anagram/

public class Task1 {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    char[] f = s.toCharArray();
    char[] g = t.toCharArray();
    Arrays.sort(f);
    Arrays.sort(g);
    return Arrays.equals(f, g);
  }
}
