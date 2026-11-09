package h11;

public class Task1  {
    public int missingNumber(int[] nums) {
        int expected=0;
        int actual=0;
        for(int i=0;i<=nums.length;i++){
            expected+=i;
        }
        for(int i=0;i<nums.length;i++){
            actual+=nums[i];
        }
        return expected-actual;
    }
}
//link=https://leetcode.com/problems/missing-number/
