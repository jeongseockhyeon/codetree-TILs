import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        int[] cntArr = new int[10];
        while(a != 0){
            cntArr[a%b]++;
            a = a / b;
        }
        for(int i = 0; i < 10; i++){
            sum += Math.pow(cntArr[i],2);
        }
        System.out.println(sum);
    }
}