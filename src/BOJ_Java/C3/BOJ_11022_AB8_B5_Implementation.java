package BOJ_Java.C3;
import java.io.*;
import java.util.StringTokenizer;


public class BOJ_11022_AB8_B5_Implementation {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + x + " + " + y + " = " + (x+y) + "\n");



        }
        bw.close();

    }
}
