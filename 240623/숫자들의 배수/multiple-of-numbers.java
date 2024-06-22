import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i <= 10 ; i++){
            System.out.print(num*i + " ");
        }
    }
}