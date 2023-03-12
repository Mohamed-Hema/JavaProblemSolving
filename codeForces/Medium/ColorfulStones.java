package codeForces.Medium;

import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        String interaction = scanner.next();
        int counter = 1;
        int x = 0;
        for(int i = 0; i < interaction.length(); i++) {
            if (value.toCharArray()[x] == interaction.toCharArray()[i]) {
                counter++;
                x++;
            }
        }
        System.out.println(counter);
    }
}
