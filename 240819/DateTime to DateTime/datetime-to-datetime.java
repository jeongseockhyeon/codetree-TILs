import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int day = 11;
        int hour = 11;
        int min = 11;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int elapsedTime = 0;
        if(day > a) return -1;
        else{
            if(hour > b) return -1;
            else{
                if(min > c) return -1;
            }
        }

        while(true){
            if(day == a && hour == b && min == c) break;

            elapsedTime++;
            min++;
            if(min == 60){
                hour++;
                min = 0;
            }
            if(hour == 24){
                day++;
                hour = 0;
            }
        }

        System.out.println(elapsedTime);


    }
}