package GeeksForGeeks.Easy;

public class BinarySearch {
    class Solution {
        int binarysearch(int arr[], int n, int k) {
            int low = 0;
            int high = n - 1;

            while(low <= high){
                int middle = low + (high - low) / 2;
                int value = arr[middle];
                if(value > k) high = middle - 1;
                else if(value < k) low = middle + 1;
                else return middle;
            }
            return -1;
        }
    }

}
