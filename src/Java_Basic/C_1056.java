package Java_Basic;
import java.util.Scanner;

public class C_1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        if (M == 0 & N == 0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
