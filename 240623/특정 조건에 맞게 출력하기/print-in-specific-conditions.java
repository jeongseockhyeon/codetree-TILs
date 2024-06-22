import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[100];
        int idx = 0;
        while(true){
            numArr[idx] = sc.nextInt();
            if(numArr[idx] == 0){
                for(int i = 0 ; i < idx ; i++){
                    if(numArr[i] % 2 == 0){
                        System.out.print(numArr[i]/2 + " ");
                    } else {
                        System.out.print(numArr[i] + 3 + " ");
                    }
                }
                break;
            }
            idx++;
            
        }
    }
}