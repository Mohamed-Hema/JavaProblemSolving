package codeWars.Easy;
import java.util.List;

public class CalculateAverage {
    public class Kata{
        public static double find_average(List<Integer> list){
            double sum = 0;
            for (int num : list) {
                sum += num;
            }
            return sum / list.size();
        }
    }

}
