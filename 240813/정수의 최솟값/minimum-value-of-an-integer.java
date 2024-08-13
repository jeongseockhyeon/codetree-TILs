import java.util.*;

public class Main {

    public static int findMin(int a, int b, int c){
        int min1 = Math.min(a,b);

        int min2 = Math.min(min1,c);

        return min2;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(findMin(a,b,c));

    }
}