package Edabit.Easy;

public class AbsoluteSum {
    public class Program {
        public static int getAbsSum(int[] nums) {
            int sum = 0;
            for(int i = 0; i < nums.length; i++){
                sum+=Math.abs(nums[i]);
            }
            return sum;
        }
    }
}
