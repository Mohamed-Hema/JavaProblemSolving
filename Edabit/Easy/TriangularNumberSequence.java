package Edabit.Easy;

public class TriangularNumberSequence {
    public class Challenge {
        public static int triangle(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
