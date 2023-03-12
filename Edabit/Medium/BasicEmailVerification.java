package Edabit.Medium;

public class BasicEmailVerification {
    public class Program {
        public static boolean validateEmail(String s) {
            if (s == null || s.isEmpty()) {
                return false;
            }
            if (s.indexOf('@') < 1 ||  s.lastIndexOf('.') < s.indexOf('@') + 2 ||  s.lastIndexOf('.') >= s.length() - 2) {
                return false;
            }
            return true;
        }
    }
}
