import java.util.*;

public class Main {
    public static int sum(int N){
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum += i;
        }


        return sum/10;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.print(sum(N));
       

    }
}