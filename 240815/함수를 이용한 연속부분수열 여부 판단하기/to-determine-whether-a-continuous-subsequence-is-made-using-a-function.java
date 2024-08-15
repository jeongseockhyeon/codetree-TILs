import java.util.*;
public class Main {
    public static final int MAX_N = 100;
    
    public static int n1, n2;
    public static int[] arrN1 = new int[MAX_N];
    public static int[] arrN2 = new int[MAX_N];
       public static boolean isSame(int n) {
        for(int i = 0; i < n2; i++)
            if(arrN1[i + n] != arrN2[i])
                return false;
    
        return true;
    }
    
    // b가 a의 연속부분수열인지 확인합니다.
    public static boolean isSubsequence() {
        for(int i = 0; i <= n1 - n2; i++)
            if(isSame(i))
                return true;
        
        return false;
    }
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for(int i = 0; i < n1; i++){
            arrN1[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++){
            arrN2[i] = sc.nextInt();
        }

        if(isSubsequence())
            System.out.print("Yes");
        else
            System.out.print("No");
    
        
    }
}