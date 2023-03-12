package hackerRank.Easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class PlusMinus {


    class Result {
        public static void plusMinus(List<Integer> arr) {
            float pos = 0;
            float neg =  0;
            float zeros = 0;
            float size = arr.size();

            for(int i = 0; i < size; i++){
                if(arr.get(i) > 0){
                    pos++;
                } else if(arr.get(i) == 0){
                    zeros++;
                } else {
                    neg++;
                }
            }
            pos /= size;
            neg /= size;
            zeros /= size;

            System.out.println(pos);
            System.out.println(neg);
            System.out.println(zeros);
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.plusMinus(arr);

            bufferedReader.close();
        }
    }

}
