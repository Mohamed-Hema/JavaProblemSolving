package Edabit.Easy;

public class CaptureTheRock {
    public static boolean canCapture(String[] rooks) {
        return rooks[0].startsWith(rooks[1].substring(0,1)) || rooks[0].endsWith(rooks[1].substring(1));
    }
}
