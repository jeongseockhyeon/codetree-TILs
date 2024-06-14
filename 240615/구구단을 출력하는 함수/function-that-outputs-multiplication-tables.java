import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        
        for(int i = numbers[0];i <= numbers[2]; i++){
            if ( i != numbers[1]){
                  for(int j = 1;j <= 9;j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            }
          
        }
        
    }
}