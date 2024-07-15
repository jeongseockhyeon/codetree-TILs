import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] cntArr = new int[5];

        int typeNum = 0;
        char sym;
        int tem;
        

        for(int i = 0; i < 3; i++){
            sym = sc.next().charAt(0);
            tem =sc.nextInt();

            if(sym == 'Y' && tem >= 37) typeNum = 1;
            else if(tem >= 37) typeNum = 2;
            else if(sym == 'Y') typeNum = 3;
            else typeNum = 4;
            cntArr[typeNum]++;
        }
         for(int i = 1; i <= 4; i++) {
            System.out.print(cntArr[i] + " ");
        }
        
        if(cntArr[1] >= 2)
            System.out.print("E");

    }
}