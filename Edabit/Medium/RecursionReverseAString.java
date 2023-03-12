package Edabit.Medium;

public class RecursionReverseAString {
    public class Program {
        public static String reverse(String str) {
            char[] arr = str.toCharArray();
            char[] reversed = new char[arr.length];
            for(int i = arr.length - 1; i >= 0; i--){
                reversed[arr.length - 1 - i] = arr[i];
            }
            return new String(reversed);
        }
    }

}
