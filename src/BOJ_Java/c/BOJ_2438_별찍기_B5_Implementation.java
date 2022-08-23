package BOJ_Java.c;
import java.io.*;
import java.io.IOException;


public class BOJ_2438_별찍기_B5_Implementation {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= a; i++){
            for (int j = 1 ; j <= i; j++){
                bw.write("*");

            }
            bw.write("\n");
        }
        bw.close();

    }
}
