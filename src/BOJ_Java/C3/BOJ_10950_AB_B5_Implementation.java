package BOJ_Java.C3;
import java.util.Scanner;

public class BOJ_10950_AB_B5_Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while (N >= 1){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
            N--;
        }

    }
}
