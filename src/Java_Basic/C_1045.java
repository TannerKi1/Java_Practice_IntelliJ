package Java_Basic;
import java.util.Scanner;


public class C_1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double c = (double) a / (double) b;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.printf("%.2f", c); // 소수점 표현하는 법 %.2f.
    }
}
