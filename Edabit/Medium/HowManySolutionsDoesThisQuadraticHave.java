package Edabit.Medium;

public class HowManySolutionsDoesThisQuadraticHave {
    public class Challenge {
        public static int solutions(int a, int b, int c) {
            int delta = b * b - 4 * a * c;

            if (delta > 0) {
                return 2;
            } else if (delta == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
