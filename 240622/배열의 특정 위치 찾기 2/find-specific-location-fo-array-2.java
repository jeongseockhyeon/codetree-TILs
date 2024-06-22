import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0 ; i < 10 ; i++){
            numArr[i] = sc.nextInt();
        }

        for (int j = 0 ; j < 10 ; j++){
            if( (j+1)%2 == 0 ){
                oddSum += numArr[j];
            } else {
                evenSum += numArr[j];
            }
        }

        int result = (oddSum > evenSum) ? oddSum - evenSum : evenSum - oddSum;

        System.out.print(result);


        
    }
}