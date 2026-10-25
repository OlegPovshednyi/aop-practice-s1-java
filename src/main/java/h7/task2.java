package h7;

public class task2 {
    public int numberOfSteps(int num) {
        int count=0;
        while (num>0) {
            if(num%2==0){
                num /= 2;
                count++;
            }
            else{
                num-=1;
                count++;
            }
        }
        return count;
    }
}
//link=https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/2181742418/
