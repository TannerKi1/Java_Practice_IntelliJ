package Java_Basic;
import java.util.Scanner;

public class C_1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        if (N >= M){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
