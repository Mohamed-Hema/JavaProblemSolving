package hackerRank.Medium;
import java.util.*;
public class FindTheMean {
    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        int size = arr.size();
        if (size % 2 == 0) {
            int middleIndex = size / 2;
            int median = (arr.get(middleIndex - 1) + arr.get(middleIndex)) / 2;
            return median;
        } else {
            int middleIndex = size / 2;
            return arr.get(middleIndex);
        }
    }
}
