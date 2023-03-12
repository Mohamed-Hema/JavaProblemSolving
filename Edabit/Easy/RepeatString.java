package Edabit.Easy;

public class RepeatString {
    public class RedundantString {
        public static String repeatString(Object t, int n) {
            if (t instanceof String) {
                String s="";
                for (int i=0; i<n; i++)
                    s+=(String)t;
                return s;
            }
            return "Not a string!";
        }
    }
}
