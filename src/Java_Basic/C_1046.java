package Java_Basic;
import java.util.Scanner;

public class C_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int value = 0;
        for (int i = 0 ; i < a ; i++){
            int k = sc.nextInt();
            value += k;

        }

        double k = (double) value / a;

        System.out.println(value);
        System.out.print(Math.round(k* 10.0) / 10.0 );
    }
}
