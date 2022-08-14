package Java_Algo;
import java.util.Scanner;

public class BOJ_2588_B3_Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int i = 2;
        while (i >= 0){
            char num = b.charAt(i);
            String num_2 = String.valueOf(num);
            int num_3 = Integer.parseInt(num_2);
            System.out.println(a * num_3);


            i--;
        }
        System.out.println(a * Integer.parseInt(b));



    }
}
