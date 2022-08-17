package Java_Basic;
import java.io.*;
import java.util.Scanner;

public class C_1049 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }


    }
}
