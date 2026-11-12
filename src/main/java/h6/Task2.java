package h6;

// https://leetcode.com/problems/valid-palindrome//
public class Task2 {

  public boolean isPalindrome(String s) {
    char[] chars = s.toCharArray();
    String result = "";

    for (int i = 0; i < chars.length; i++) {
      if (Character.isLetter(chars[i]) || Character.isDigit(chars[i])) {
        result += Character.toLowerCase(chars[i]);
      }
    }

    int left = 0;
    int right = result.length() - 1;

    while (left < right) {
      if (result.charAt(left) != result.charAt(right)) {
        return false;
      }

      left++;
      right--;
    }

    return true;
  }
}
