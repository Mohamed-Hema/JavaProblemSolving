package codeWars.Medium;

public class SumOfCubes {
    public static class Solution {
        public static double sumCubes(long n) {
            double sum = 0;
            for (double i = 1; i <= n; i++) {
                double power = Math.pow(i, 3);
                sum += power;
            }
            return sum;
        }
    }
}
