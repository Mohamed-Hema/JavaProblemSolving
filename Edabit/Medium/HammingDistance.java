package Edabit.Medium;

public class HammingDistance {
    public class Challenge {
        public static int hammingDistance(String str1, String str2) {
            int count = 0, i = 0;
            while(i < str1.length()){
                if(str1.charAt(i) != str2.charAt(i))
                    count++;
                i++;
            }
            return count;
        }
    }
}
