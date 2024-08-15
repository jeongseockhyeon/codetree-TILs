import java.util.*;

public class Main {
    public static int Option(int a, char o, int c){
       if(o =='+') return a+c;
       else if(o == '-') return a-c;
       else if(o == '/') return a/c;
       else return a*c;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        System.out.print(a+" "+o+" "+c+" = "+Option(a,o,c));

    }
}