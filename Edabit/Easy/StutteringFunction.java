package Edabit.Easy;

public class StutteringFunction {
    public static String stutter(String word) {
        String start = word.substring(0,2)+"... ";
        return start+start+word+"?";
    }
}
