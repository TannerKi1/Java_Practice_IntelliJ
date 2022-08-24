package BOJ_Java.B2;
import java.util.Scanner;

public class BOJ_2480_주사위세개_B3_Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b & b == c & a ==c ){
            System.out.println(10000 + a * 1000);
        }
        if (a != b & b == c){
            System.out.println(1000 + b * 100);
        }
        if (b != c & a == b){
            System.out.println(1000 + a * 100);
        }
        if (b != c & a == c){
            System.out.println(1000 + a * 100);
        }
        if (a != b & b != c & a != c){
            int d = Math.max(a, b);
            int e = Math.max(d, c);
            System.out.println(e * 100);
        }
    }
}
