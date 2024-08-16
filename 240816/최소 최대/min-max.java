import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numArr = new int[n];

        for(int i = 0; i < n; i++){
            numArr[i] = sc.nextInt();
        }

        Arrays.sort(numArr);
        System.out.print(numArr[0]+" "+numArr[n-1]);
    }
}