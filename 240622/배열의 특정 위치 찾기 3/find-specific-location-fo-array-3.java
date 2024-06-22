import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[100];
        int idx = 0;

        while (true){
            int num = sc.nextInt();
            numArr[idx] = num;
            idx++;

            if (num == 0){
                break;
            }
        }

        int sum = numArr[idx-2]+numArr[idx-3]+numArr[idx-4];
        System.out.print(sum);
    }
}