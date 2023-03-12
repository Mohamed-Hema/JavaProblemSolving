package HackerEarth.Easy;
import java.util.*;
public class Zoos {


    class TestClass {
        public static void main(String args[] ) throws Exception {

            //Scanner
            Scanner s = new Scanner(System.in);
            String word = s.nextLine();
            int x = 0;
            int y = 0;
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == 'z'){
                    x++;
                } else {
                    y++;
                }
            }
            if(y == 2* x){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
