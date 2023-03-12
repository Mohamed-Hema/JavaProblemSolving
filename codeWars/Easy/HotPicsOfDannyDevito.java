package codeWars.Easy;

public class HotPicsOfDannyDevito {
    public class Program {
        public static String preventDistractions(String args) {
            String[] items = {"anime","meme","vine","roasts","Danny DeVito"};
            boolean found = false;
            for (String item : items) {
                if (args.contains(item)) {
                    found = true;
                    break;
                }
            }
            return found ? "NO!" : "Safe watching!";
        }
    }
}
