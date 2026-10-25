package h2;

class hw2_task1 {
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
//link = https://leetcode.com/submissions/detail/2161517045//