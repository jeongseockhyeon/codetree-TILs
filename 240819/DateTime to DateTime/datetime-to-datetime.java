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
   

        while(true){
            if(day == a && hour == b && min == c) break;
            if(day > a) {
                elapsedTime = -1;
                break;
            }   
            else if(day == a){
                if(hour > b) {
                    elapsedTime = -1;
                    break;
                } else if(hour == b){
                    if(min > c) {
                        elapsedTime = -1;
                        break;
                    } 
                }
            }

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