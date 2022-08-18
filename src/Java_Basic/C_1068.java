package Java_Basic;
import java.util.Scanner;

public class C_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if ( N <= 100 & N >= 90){
            System.out.println("A");
        }
        else if ( N <= 89 & N >= 70){
            System.out.println("B");
        }
        else if ( N < 70 & N >= 40){
            System.out.println("C");
        }
        else if ( N < 40 & N >= 0){
            System.out.println("D");
        }



    }
}
