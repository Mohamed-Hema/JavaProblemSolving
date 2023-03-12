package Edabit.Medium;

public class RecursionArraySum {
    public class Program {
        public static int sum(int[] arr) {
            int sum = 0;
            for(int i = 0; i <arr.length; i++){
                sum+=arr[i];
            }
            return sum;
        }
    }
}
