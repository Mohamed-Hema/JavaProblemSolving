package Edabit.Easy;

public class BasicOperation {
    public static int operation(String a, String b, String op) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        int result = 0;

        switch(op){
            case "add":
                result = numA + numB;
                break;
            case "subtract":
                result = numA - numB;
                break;
            case "multiply":
                result = numA * numB;
                break;
            case "divide":
                try {
                    result = numA / numB;
                } catch (ArithmeticException e) {
                    result = Integer.MIN_VALUE;
                }
                break;
            default:
                result = Integer.MIN_VALUE;
                break;
        }

        return result;
    }
}
