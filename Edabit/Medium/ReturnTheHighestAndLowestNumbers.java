package Edabit.Medium;

public class ReturnTheHighestAndLowestNumbers {
    public class Program {
        public static String highLow(String s) {
            String[] numsStr = s.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }
            int min = nums[0];
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            return max + " " + min;
        }
    }
}
