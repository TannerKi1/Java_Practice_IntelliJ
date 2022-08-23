package BOJ_Java.String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720_숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");

        int sum = 0;

        for (int i = 0; i < n; i++){
            String b = str[i];
            int c = Integer.parseInt(b);
            sum += c;
        }
        System.out.println(sum);
    }

}
