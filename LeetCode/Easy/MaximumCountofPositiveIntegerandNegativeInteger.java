package LeetCode.Easy;

public class MaximumCountofPositiveIntegerandNegativeInteger {
    class Solution {
        public int maximumCount(int[] nums) {
            int negSum = 0;
            int posSum = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] < 0){
                    negSum +=1;
                } else if(nums[i] > 0) {
                    posSum += 1;
                }

            }
            if(negSum > posSum) return negSum;
            else return posSum;
        }
    }
}
