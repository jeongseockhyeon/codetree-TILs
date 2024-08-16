import java.util.*;

public class Main {
    public static int makeOne(int num,int cnt){
        if(num == 1) return cnt;
        if(num % 2 == 0) return makeOne(num/2,cnt+1);
        else return makeOne(num/3,cnt+1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0;

        System.out.print(makeOne(num,cnt));

    }
}