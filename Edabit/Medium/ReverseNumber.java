package Edabit.Medium;

public class ReverseNumber {
    public class Challenge {
        public static String rev(int n) {
            String num = Math.abs(n) + "";
            StringBuilder reversed = new StringBuilder(num).reverse();
            return reversed.toString();
        }
    }
}
