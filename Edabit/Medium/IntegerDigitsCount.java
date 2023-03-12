package Edabit.Medium;

public class IntegerDigitsCount {
    public class IntegerDigits {
        public static int count(int n) {
            return Math.abs(n) < 10 ? 1 : count(n / 10) + 1;
        }
    }
}
