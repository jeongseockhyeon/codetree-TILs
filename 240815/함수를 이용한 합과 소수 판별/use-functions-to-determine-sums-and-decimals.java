import java.util.*;

public class Main {
    public static boolean isPrime(int i){
        if(i == 1){
            return false;
        }
        for(int j = 2; j < i; j++){
            if(i % j == 0){
                return false;
            }
        }

        return true;
    }
    public static boolean isEven(int i){
        int sum = 0;
        while(i != 0){
            sum += i % 10;
            i /= 10;
        }

        if(sum % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for(int i = a; i <= b ; i++){
            if(isPrime(i) && isEven(i)){
                cnt++;
            }
        }

        System.out.print(cnt);

    }
}