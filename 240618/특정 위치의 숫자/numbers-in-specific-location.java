import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];

        for(int i = 0;i<10;i++){
            numArr[i] = sc.nextInt();
        }

        int sum = numArr[2]+numArr[4]+numArr[9];

        System.out.println(sum);
    }
}