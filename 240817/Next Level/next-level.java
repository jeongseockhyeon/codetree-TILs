import java.util.*;

class User{
    String id;
    int lv;
    public User(String id, int lv){
        this.id = id;
        this.lv = lv;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        User user1 = new User("codetree",10);
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int lv = sc.nextInt();

        User user2 = new User(id,lv);

        System.out.println("user "+user1.id+" lv "+user1.lv);
        System.out.println("user "+user2.id+" lv "+user2.lv);
    }
}