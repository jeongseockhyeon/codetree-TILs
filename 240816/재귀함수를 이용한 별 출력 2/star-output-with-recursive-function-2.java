import java.util.*;

public class Main {
    public static void printStar(int num){
        if(num == 0) return;
        for(int i = 0; i < num; i++){
            System.out.print("* ");
        }
        System.out.println();
        printStar(num - 1);
        for(int i = 0; i < num; i++){
            System.out.print("* ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        printStar(num);
    }
}