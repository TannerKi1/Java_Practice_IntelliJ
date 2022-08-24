package BOJ_Java.C3;
import java.util.Scanner;

public class BOJ_25304_영수증_B5_Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();
        int sum = 0;

        while (num >= 1){
            sum += sc.nextInt() * sc.nextInt();
            num--;
        }

        if (total == sum){
            System.out.println("Yes");

        }
        else {
            System.out.println("No");
        }



    }
}
