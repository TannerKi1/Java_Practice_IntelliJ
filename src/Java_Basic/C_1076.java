package Java_Basic;
import java.io.*;
import java.util.Scanner;

public class C_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char value = a.charAt(0);

        for (char i = 'a'; i <= value; i++){
            System.out.printf("%c ", i);


        }
    }
}
