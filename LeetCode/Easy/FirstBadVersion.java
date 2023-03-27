package LeetCode.Easy;

public class FirstBadVersion {
    public class Solution {
        public int firstBadVersion(int n) {
            int left = 0;
            int right = n;

            while(left < right){
                int midpoint = left + (right - left) / 2;
                if(isBadVersion(midpoint)){
                    right = midpoint;
                } else {
                    left = midpoint + 1;
                }
            }

            if(left == right && isBadVersion(left)){
                return left;
            }

            return -1;
        }

        private boolean isBadVersion(int left) {
            return false;
        }
    }
}
