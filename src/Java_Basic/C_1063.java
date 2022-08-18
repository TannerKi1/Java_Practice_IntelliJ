package Java_Basic;
import java.util.Scanner;

public class C_1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Z = (N > M) ? N : M; // 비트 연산에 대한 기호..!

        System.out.print(Z);
    }
}
