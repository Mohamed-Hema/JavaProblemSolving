package Edabit.Easy;

public class FindTheBomb {
    public static String bomb(String str) {
        if (str.toLowerCase().contains("bomb")) {
            return "DUCK!";
        } else {
            return "Relax, there's no bomb.";
        }
    }
}

