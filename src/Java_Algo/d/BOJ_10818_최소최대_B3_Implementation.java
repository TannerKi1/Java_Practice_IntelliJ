package Java_Algo.d;
import java.io.*;
import java.util.StringTokenizer;


public class BOJ_10818_최소최대_B3_Implementation {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int min = 1000001;
        int max = -1000001;

        while (st.hasMoreTokens()){
            int val = Integer.parseInt(st.nextToken());
            if (val > max){
                max = val;
            }
            if (val < min){
                min = val;
            }
        }
        System.out.println(min + " " + max);
        }
}
