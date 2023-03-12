package Edabit.Medium;

public class AddingNumbers {
    public class NumericString {
        public static String add(String a, String b) {
            if(a == "" || a == null || b == "" || b == null){
                return "Invalid Operation";
            }	else {
                int newA = Integer.parseInt(a);
                int newB = Integer.parseInt(b);
                int newC = newA + newB;
                return Integer.toString(newC);

            }
        }
    }
}
