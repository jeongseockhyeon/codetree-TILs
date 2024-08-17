import java.util.*;

public class Main {
    public static boolean equalsArr(int[] firstArr, int[] secondArr){
        for(int i = 0; i < firstArr.length; i++){
            if(firstArr[i] != secondArr[i]) return false;
        }
        return true;
    }
    public static int[] createArr(int n,Scanner sc){
        int[] numArr = new int[n];
          for(int i = 0; i < n; i++){
            numArr[i] = sc.nextInt();
        }
        return numArr;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] firstArr = createArr(n,sc);
        int[] secondArr = createArr(n,sc);

        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        if(equalsArr(firstArr,secondArr)) System.out.print("Yes");
        else System.out.print("No");
      
    }
}