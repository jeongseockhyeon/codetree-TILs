import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int day = 1;
        String[] dayOfWeek = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] lastDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(true){
            if(m1 == m2 && d1 == d2-1) break;
            d1++;
            day++;
            if(m1 > 12){
                m1 = 1;
            }
            if(d1 > lastDays[m1]){
                m1++;
                d1 = 1;
                
            }

            if(day > 6){
                day = 0;
            }
        }
        System.out.println(dayOfWeek[day]);
    }
}