package codeWars.Medium;

public class YoureASquare {
    public class Square {
        public static boolean isSquare(int n) {
            double sqrt = Math.sqrt(n);
            return sqrt == (int) sqrt;
        }
    }

}
