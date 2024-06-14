import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0){
            for (int i = 2; i <= num; i++){
                if (i % 2 == 0){
                    System.out.print(i + " ");
                }
                
            }
        } else {
            for (int i = 1; i <= num; i++){
                if (i % 2 != 0 ){
                    System.out.print(i + " ");
                }
                
            }
        }

    }
}