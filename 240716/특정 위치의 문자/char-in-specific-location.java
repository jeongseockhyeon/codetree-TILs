import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        char[] wordArr = new char[] {'L','E','B','R','O','S'};

        int idx = -1;

        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        for(int i = 0; i < 6; i++){
            if(wordArr[i] == a) idx = i;
        }

        if (idx == -1){
            System.out.println("None");
        } else {
            System.out.println(idx);
        }


    }
}