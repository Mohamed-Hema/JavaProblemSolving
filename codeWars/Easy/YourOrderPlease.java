package codeWars.Easy;

public class YourOrderPlease {
    public static String order(String words) {
        if (words == null || words.isEmpty()) {
            return "";
        }

        String[] arr = words.split(" ");
        String[] result = new String[arr.length];

        for (String s : arr) {
            int position = Integer.parseInt(s.replaceAll("\\D", ""));
            result[position - 1] = s;
        }

        return String.join(" ", result);
    }

}
