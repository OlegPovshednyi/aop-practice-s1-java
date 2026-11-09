package h11;

public class Task2 {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
                count=1;

            }
            else if (nums[i] == candidate) {
                count++;
            }
            else if(nums[i]!=candidate){
                count--;
            }

        }
        return candidate;

    }


}

//link=https://leetcode.com/problems/majority-element/
