import java.util.*;

public class Main {
    public static boolean yon(int n){
        int first = n/10;
        int second = n%10;
        int sum = first+second;

        if(n % 2 == 0 & sum % 5 == 0){
            return true;
        } 

        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(yon(n)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}