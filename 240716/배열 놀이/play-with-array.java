import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] numArr = new int[n];

        int idx = 0;

        for(int i =0; i < n; i++){
            numArr[i] = sc.nextInt();
        }
        for(int i = 0; i < q; i++){
            int query = sc.nextInt();
            if(query == 1){
                int a = sc.nextInt();
                System.out.println(numArr[a-1]);
            } else if(query == 2){
                int b = sc.nextInt();
                for(int j = 0; j < n; j++){
                    if(numArr[j] == b){
                        idx = j+1;
                        System.out.println(idx);
                        break;
                    }
                }
                if(idx == 0) System.out.println(idx);
            } else{
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int j = s-1; j < e; j++){
                    System.out.print(numArr[j]);
                    System.out.print(' ');
                }
            }
        }
    }
}