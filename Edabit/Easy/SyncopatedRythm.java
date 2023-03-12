package Edabit.Easy;

public class SyncopatedRythm {
    public class Rhythm {
        public static boolean hasSyncopation(String s) {
            for (int i = 1; i < s.length(); i += 2) {
                if (s.charAt(i) == '#') {
                    return true;
                }
            }
            return false;	}
    }
}
