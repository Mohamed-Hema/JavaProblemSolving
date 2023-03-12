package hackerRank.OOP;
public class JavaInheritance {
    public static void main(String[] args){

        class Arithmetic {
            int add(int num1, int num2) {
                return num1 + num2;
            }
        }
        class Adder extends Arithmetic{

        }
    }
}
