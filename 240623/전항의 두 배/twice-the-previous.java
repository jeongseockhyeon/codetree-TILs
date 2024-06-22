import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[10];

        numArr[0] = sc.nextInt();
        numArr[1] = sc.nextInt();

        System.out.print(numArr[0] + " " + numArr[1] + " ");

        for (int i = 2 ; i < 10 ; i++){
            numArr[i] = numArr[i-1] + 2 * numArr[i-2];
            System.out.print(numArr[i] + " ");
        }

    }
}