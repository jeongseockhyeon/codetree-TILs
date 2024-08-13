import java.util.*;

public class Main {
    public static boolean find(int i){
        while(i != 0){
            if( i % 10 == 3 || i % 10 == 6 || i % 10 == 9){
                return true;
            }
            i /= 10;
        }
        return false;
    }
 

    public static int cnt(int a, int b){
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if( find(i) || i % 3 == 0 ){
                cnt++;
            }
           
        }
         return cnt;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(cnt(a,b));

    }
}