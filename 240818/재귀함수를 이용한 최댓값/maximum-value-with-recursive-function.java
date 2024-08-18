import java.util.*;

public class Main {
    public static int[] numArr = new int[100];
    public static int findMax(int n){
        int index = n;
        if(index == 0) return numArr[index];

        return Math.max(findMax(index-1),numArr[index]);

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            numArr[i] = sc.nextInt();
        }

        System.out.print(findMax(n-1));


    }
}