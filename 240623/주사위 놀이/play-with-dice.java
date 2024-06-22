import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[10];

        int[] cntArr = new int[6];

        for(int i = 0; i < 10 ; i++){
            numArr[i] = sc.nextInt();
            cntArr[numArr[i]-1]++;
        }
        for (int j = 0 ; j < 6 ; j++){
            System.out.println(j + 1 + " - " + cntArr[j]);
        }
    }
}