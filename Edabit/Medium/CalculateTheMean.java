package Edabit.Medium;

public class CalculateTheMean {
    public class Program {
        public static double mean(int[] nums) {
            double sum = 0;
            for(int i = 0; i < nums.length; i++){
                sum += nums[i];
            }
            double mean = sum / nums.length;
            return Math.round(mean * 100.0) / 100.0;
        }
    }

}
