import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[8];
        int sum = 0;
        for (int i = 0 ; i < 8 ; i++){

            numArr[i] = sc.nextInt();
        }


        for (int j = 0 ; j < 8 ; j++){
            if(numArr[j]==0){
                for (int k = j-1 ; k >= j-3 ; k--){
                    sum += numArr[k];
                    continue;
                }
            }
        }

        System.out.print(sum);

    }
}