package codeWars.Medium;

public class SimpleFunReverseLetter {
    public class Kata {
        public static String reverseLetter(final String str) {
            String someString = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    someString = str.charAt(i) + someString;
                }
            }
            return someString;
        }
    }
}
