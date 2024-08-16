import java.util.*;

public class Main {
    public static int Max(int[] numArr){
        int max = numArr[0];
        for(int i = 0; i < numArr.length; i++){
            if(max < numArr[i]) max = numArr[i];
        }
        return max;
    }

    public static int Min(int[] numArr){
        int min = numArr[0];
        for(int i = 0; i < numArr.length; i++){
            if(min > numArr[i]) min = numArr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numArr = new int[n];

        for(int i = 0; i < n; i++){
            numArr[i] = sc.nextInt();
        }
        System.out.print(Min(numArr)+" "+Max(numArr));
    }
}