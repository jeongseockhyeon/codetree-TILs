import java.util.*;

class Secret{
    String secretCode;
    char meetingPoint; 
    int time;

    public Secret(String secretCode, char meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
};

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String secretCode = sc.next();
        char meetingPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        Secret secret = new Secret(secretCode,meetingPoint,time);

        System.out.println("secret code : " + secret.secretCode);
        System.out.println("meeting point : " + secret.meetingPoint);
        System.out.println("time : " + secret.time);
    }
}