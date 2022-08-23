package Java_Algo.c;
import java.io.*;
import java.util.StringTokenizer;



public class BOJ_11021_AB7_B5_Implementation {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a ; i++){
            st = new StringTokenizer(br.readLine());
            bw.write("Case #" + i + ": " +(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");

        }
        bw.close();


    }
}
