package Java_Algo.d;
import java.util.*;
import java.io.*;

public class BOJ_4344_평균은넘겠지_B1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            int k = Integer.parseInt(str[0]);

            int sum = 0;

            for (int j = 1; j < k + 1; j++){
                sum += Integer.parseInt(str[j]);
            }
            int avg = sum / k;

            int cnt = 0;
            for (int j = 1; j < k + 1; j++){
                if (Integer.parseInt(str[j]) > avg){
                    cnt += 1;
                }
            }

            double answer = cnt * 100.00 / k;

            System.out.printf("%.3f", answer);
            System.out.println("%");









            // 첫번째 숫자를 더해야하는 숫자로받고, 뒤의 숫자들을 모두 더해서 나눠주면 된다...//


        }
    }
}