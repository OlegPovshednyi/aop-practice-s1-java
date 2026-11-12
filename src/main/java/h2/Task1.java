package h2;

// https://leetcode.com/submissions/detail/2161517045//
class Task1 {
  public int addDigits(int num) {
    while (num >= 10) {
      int sum = 0;

      while (num > 0) {
        int digit = num % 10;
        sum += digit;
        num /= 10;
      }

      num = sum;
    }

    return num;
  }
}
