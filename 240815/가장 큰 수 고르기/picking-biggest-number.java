import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];

        for(int i = 0; i < 10; i++){
            numArr[i] = sc.nextInt();
        }
        int Max = numArr[0];
        for(int i = 0; i < 10; i++){
            if(Max < numArr[i]){
                Max = numArr[i];
            }
        }

        System.out.print(Max);

    }
}