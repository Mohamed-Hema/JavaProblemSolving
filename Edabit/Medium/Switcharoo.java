package Edabit.Medium;

public class Switcharoo {
    public class Program {
        public static String flipEndChars(String s) {
            if (s.length() < 2) {
                return "Incompatible.";
            }
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            String middle = s.substring(1, s.length() - 1);
            String result = last + middle + first;
            if (first == last) {
                return "Two's a pair.";
            } else {
                return result;
            }
        }
    }

}
