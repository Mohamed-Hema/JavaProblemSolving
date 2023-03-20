package codeWars.Medium;

public class SumOfNumbersFrom0ToN {
    public class SequenceSum {

        public static String showSequence(int value) {
            if (value == 0) {
                return "0=0";
            } else if (value < 0) {
                return value + "<0";
            } else {
                int sum = 0;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i <= value; i++) {
                    sb.append(i).append("+");
                    sum += i;
                }
                sb.deleteCharAt(sb.length() - 1);
                sb.append(" = ").append(sum);
                return sb.toString();
            }
        }
    }

}
