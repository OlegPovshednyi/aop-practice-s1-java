package h8;

public class task1 {
    public int findMaxConsecutiveOnes(int[] nums) {
    int count=0;
    int maxcount=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            count++;
        }
        else{
            count=0;
        }
        if(count>maxcount){
            maxcount=count;
        }
    }
    return maxcount;
}
}

//link =https://leetcode.com/problems/max-consecutive-ones/submissions/2182586294/

