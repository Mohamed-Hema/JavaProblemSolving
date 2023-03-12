package codeWars.Easy;

public class SquareNSum {
    public class Kata {
        public static int squareSum(int[] numbers) {
            int sum = 0;
            for (int n : numbers) {
                sum += n * n;
            }

            return sum;
        }
    }
}
