import java.util.*;

public class Main {
    public static int sum(int n){
        if(n > 100) return 0;
        return n + sum(n+2);
       
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(sum(n));

    }
}