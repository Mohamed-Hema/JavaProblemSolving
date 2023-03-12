package codeWars.Medium;

public class MakeFunctionThatDoesArithmetic {
    public static class ArithmeticFunction {
        public static int arithmetic(int a, int b, String operator) {
            switch(operator){
                case "add":
                    return a+b;
                case "subtract":
                    return a-b;
                case "multiply":
                    return a*b;
                default:
                    return a/b;

            }
        }
    }
}
