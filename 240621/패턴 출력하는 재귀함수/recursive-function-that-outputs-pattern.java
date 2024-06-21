import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num > 369){
            for(int i = 369; i <= num; i++){
                if( i  % 2 != 0){
                    System.out.print(i + " ");
                }
            }
        } else {
            for(int i = num; i <= 369; i++){
                if( i  % 2 != 0){
                    System.out.print(i + " ");
                }
            }
        }

    }
}