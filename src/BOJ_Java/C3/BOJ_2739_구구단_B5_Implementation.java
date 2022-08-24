package BOJ_Java.C3;
import java.util.Scanner;

public class BOJ_2739_구구단_B5_Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;

        while (i < 10){
            System.out.println(a + " * " + i + " = " + a * i);
            i++;

        }

    }
}
