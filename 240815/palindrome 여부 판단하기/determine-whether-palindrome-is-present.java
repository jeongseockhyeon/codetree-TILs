import java.util.*;

public class Main {
    public static String reverse(String str){
        String temp = "";
        for(int i = str.length()-1; i >= 0; i--){
            temp += str.charAt(i);
        }

        return temp;

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.equals(reverse(str))){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}