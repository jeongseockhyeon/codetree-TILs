import java.util.*;

public class Main {
    public static int powSum(int num){
        if(num == 0) return num;
        return powSum(num/10) + (int)Math.pow(num%10,2);

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.print(powSum(num));


    }
}