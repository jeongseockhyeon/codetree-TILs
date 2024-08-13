import java.util.*;

public class Main {
    public static void findLcm(int n, int m){
        int lcm =0;
        for(int i = Math.max(n,m); i <= n*m; i++){
            if(i % n == 0 && i % m == 0){
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        findLcm(n,m);


    }
}