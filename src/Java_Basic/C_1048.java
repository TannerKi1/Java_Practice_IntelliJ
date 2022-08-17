package Java_Basic;
import java.util.Scanner;

public class C_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = a * Math.pow(2, b);

        System.out.println((int) c);

    }
}
