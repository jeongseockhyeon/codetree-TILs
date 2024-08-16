import java.util.*;

public class Main {
    public static void getNum(int n){
        if(n == 0) return;
        getNum(n/3);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        getNum(n);

    }
}