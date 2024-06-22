import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[100];
        numArr[0] = 1;
        numArr[1] = sc.nextInt();
        

        int idx = 2;

        while(true){
            numArr[idx] = numArr[idx-1] + numArr[idx-2];

            if(numArr[idx] >= 100){
                for(int i = 0 ; i <= idx ; i++){
                    System.out.print(numArr[i] + " ");
                }
                break;
            }

            idx++;
        }
    }
}