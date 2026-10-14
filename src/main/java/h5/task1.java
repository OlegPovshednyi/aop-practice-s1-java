package h5;

public class task1 {

        public int maxProductDifference(int[] nums) {
            int min1 = nums[0];
            int min2 = nums[1];
            int max1 = nums[0];
            int max2 = nums[1];

            if (min1 > min2) {
                int temp = min1;
                min1 = min2;
                min2 = temp;
            }

            if (max1 < max2) {
                int temp = max1;
                max1 = max2;
                max2 = temp;
            }
            for(int i=2;i<nums.length;i++){
                if (nums[i] < min1) {
                    min2 = min1;
                    min1 = nums[i];
                } else if (nums[i] < min2) {
                    min2 = nums[i];
                }
                if (nums[i] >max1) {
                    max2 = max1;
                    max1 = nums[i];
                } else if (nums[i] >max2) {
                    max2 = nums[i];
                }

            }
            return(max1*max2)-(min1*min2);
        }
    }
//link= https://leetcode.com/problems/maximum-product-difference-between-two-pairs//
