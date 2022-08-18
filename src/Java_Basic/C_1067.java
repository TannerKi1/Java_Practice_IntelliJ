package Java_Basic;
import java.util.Scanner;

public class C_1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 0){
            System.out.println("minus");
            if (N % 2 == 0){
                System.out.println("even");

            }
            else {
                System.out.println("odd");
            }
        }
        if (N > 0){
            System.out.println("plus");
            if (N % 2 == 0){
                System.out.println("even");

            }
            else {
                System.out.println("odd");
            }
        }
    }
}
