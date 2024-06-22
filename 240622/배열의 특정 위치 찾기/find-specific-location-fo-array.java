import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int sum = 0;
        double three = 0;
        int count = 0;
        

        for (int i = 0 ; i < 10 ; i++){
            numArr[i] = sc.nextInt();
        }

        for (int j = 1; j < 10 ; j += 2){
            sum += numArr[j];
        }

        for (int k = 0; k < 10 ; k++){
            if((k+1)%3==0){
                three += numArr[k];
                count++;
                
            }
        }

        double threeAvg = three / count;

        System.out.print(sum + " " + threeAvg);


    }
}