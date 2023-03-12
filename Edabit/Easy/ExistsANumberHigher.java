package Edabit.Easy;

public class ExistsANumberHigher {
    public static boolean existsHigher(int[] arr, int n) {
        if (arr.length == 0) return false;
        for (int i : arr) {
            if (i >= n) return true;
        }
        return false;
    }
}