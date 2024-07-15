import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int[] cntArr = new int[11];
        int[] numArr = new int[100];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 100; i++){
            numArr[i] = sc.nextInt();

            if(numArr[i] == 0) break;

            else if(numArr[i] < 10) continue;
            cntArr[numArr[i]/10]++;
        }

        for(int i = 10; i >= 1; i--){
            System.out.println(i + "0" + " - " + cntArr[i]);
        }

    }
}