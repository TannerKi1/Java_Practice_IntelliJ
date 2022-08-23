package Java_Algo.d;
import java.io.*;

public class BOJ_2562_최댓값_B3 {
    public static void main(String[] args) throws IOException {
        int n = 9;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index = 0;

        for (int i = 0; i < n; i++){
            int val = Integer.parseInt(br.readLine());
            if (val > max){
                max = val;
                index = i + 1;
            }

        }

        System.out.println(max);
        System.out.println(index);

    }
}
