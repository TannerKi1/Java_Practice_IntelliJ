package BOJ_Java.b;
import java.util.Scanner;

public class BOJ_2753_윤년_Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 4 != 0){
            System.out.println(0);
        }

        if (a % 4 == 0) {
            if (a % 100 != 0){
                System.out.println(1);

            }
            if (a % 100 == 0 & a % 400 != 0){
                System.out.println(0);
            }
            if (a % 100 == 0 & a % 400 == 0) {
                System.out.println(1);
            }
        }


    }

}
