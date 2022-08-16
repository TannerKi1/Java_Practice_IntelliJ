package Java_Algo;
import java.util.Scanner;

public class BOJ_2525_오븐시계_B3_Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total_minute = b + c;
        int new_hour = total_minute / 60;
        int new_minute = total_minute % 60;

        int real_new_hour = a + new_hour;

        if (real_new_hour < 24) {

            System.out.println(real_new_hour + " " + new_minute);

        }
        if (real_new_hour >= 24){
            System.out.println(real_new_hour - 24 + " " + new_minute);
        }
        }

    }
