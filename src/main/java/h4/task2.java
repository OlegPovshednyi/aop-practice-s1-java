package h4;

public class task2 {
    public int findComplement(int num) {
        int mask = 1;

        while (mask < num) {
            mask = (mask << 1) | 1;
        }

        return num ^ mask;
    }

    }

// Link to task 2: https://leetcode.com/problems/number-complement/