package Edabit.Medium;

public class FixBasicCalculator {
    public class Calculator {
        public static Object basicCalculator(int a, String o, int b) {
            if(o.equals("+"))
                return a + b;
            if(o.equals("-"))
                return a - b;
            if(o.equals("*"))
                return a * b;
            if(o.equals("/") && b != 0)
                return a / b;
            else
                return null;
        }
    }
}
