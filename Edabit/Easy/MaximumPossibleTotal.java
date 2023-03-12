package Edabit.Easy;
import java.util.Arrays;

public class MaximumPossibleTotal {
    public class Challenge {
        public static int maxTotal(int[] nums) {
            int sum = 0;
            Arrays.sort(nums);
            for(int i  = 5; i < nums.length; i++){
                sum+=nums[i];
            }
            return sum;
        }
    }
}
