import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int num = sc.nextInt();
        int cnt = 0;

        int[] numArr = new int[len];

        for(int i = 0; i < len; i++){
            numArr[i] = sc.nextInt();

            if(numArr[i] == num) cnt++;
        }

        System.out.println(cnt);

    }
}