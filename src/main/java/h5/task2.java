package h5;

public class task2 {

        public int[] sortedSquares(int[] nums) {
            int[] arr = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                arr[i] = nums[i] * nums[i];
            }

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            return arr;
        }
    }
//link= https://leetcode.com/problems/squares-of-a-sorted-array//
