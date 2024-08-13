import java.util.*;

public class Main {
    public static int first(int i){
        return i/10;
    }
    public static int second(int i){
        return i%10;
    }

    public static int cnt(int a, int b){
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(first(i) == 3 || second(i) == 3 || first(i) == 6 || second(i) == 6|| first(i) == 9 || second(i) == 9 || i % 3 == 0 ){
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