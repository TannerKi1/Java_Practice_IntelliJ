package BOJ_Java.B2;
import java.util.Scanner;

public class BOJ_2884_ěëěęł_B3_Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (hour > 0 & minute >= 45){
            System.out.print(hour + " ");
            System.out.println(minute - 45);
        }
        if (hour > 0 & minute < 45){
            System.out.print(hour - 1 +" ");
            System.out.println(minute + 60 - 45);
        }
        if (hour == 0 & minute < 45){
            System.out.print(23 + " ");
            System.out.println(minute + 60 - 45);
        }
        if (hour == 0 & minute >= 45){
            System.out.print(hour + " ");
            System.out.println(minute - 45);
        }
        }
    }