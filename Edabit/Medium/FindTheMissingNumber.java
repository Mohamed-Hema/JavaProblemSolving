package Edabit.Medium;

public class FindTheMissingNumber {
    public class Program {
        public static int missingNum(int[] nums) {
            int sum = 55;
            int arraySum = 0;
            for (int num : nums) {
                arraySum += num;
            }
            return sum - arraySum;
        }
    }

}
