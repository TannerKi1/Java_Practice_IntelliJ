package Java_Algo.c;

import java.io.*;


public class BOJ_2439_별찍기2_B5_Implementation {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= a; i++){

            for (int k = 1; k <= a - i; k++){
                bw.write(" ");
            }

            for (int j = 1 ; j <= i; j++){
                bw.write("*");

            }
            bw.write("\n");
        }
        bw.close();

    }
}
