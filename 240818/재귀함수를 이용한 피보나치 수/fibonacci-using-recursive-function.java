import java.util.*;

public class Main {
    public static int F(int n){
        if(n==1 || n==2) return 1;
        return F(n-1)+ F(n-2);

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(F(n));

    }
}