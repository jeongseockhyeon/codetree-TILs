import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numArr = new int[n];


        for(int i = 0;i < n;i++){
            numArr[i] = sc.nextInt();
        }

        int a = numArr[0];
        int b = 0;

        int minHundred = 200;

        for(int j = 0;j < n;j++){
            if( Math.abs(100-a) > Math.abs(100-numArr[j]) ){
                a = numArr[j];
            }

            if(numArr[j] >= 100 && numArr[j] < minHundred){
                minHundred = numArr[j];
                b= numArr[j];
            }
        }



        System.out.println(a + " " + b);


        

    }
}