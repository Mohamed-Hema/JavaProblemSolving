public class Test {
    public static void main(String[] args){
        String s = "atos";
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j <= arr.length; j++){
                if(arr[i] != arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
