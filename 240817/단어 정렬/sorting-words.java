import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] strArr = new String[n];

        for(int i = 0; i < n+1; i++){
            strArr[i] = sc.nextLine();
            System.out.println(strArr[i]);
        }
        Arrays.sort(strArr);
        
        for(int i = 0; i < n+1; i++){
            System.out.println(strArr[i]);
        }
    }
}