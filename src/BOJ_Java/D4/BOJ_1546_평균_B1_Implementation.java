package BOJ_Java.D4;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1546_평균_B1_Implementation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        ArrayList<Integer> num = new ArrayList<Integer>();

        StringTokenizer sc = new StringTokenizer(br.readLine(), " ");

        double answer = 0;

        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(sc.nextToken());
            num.add(k);
            if (k > max) {
                max = k;
            }
        }

        for (int i = 0; i < N; i++) {
            int p = num.get(i);
            double pp = (p * 100.0 / max);
            answer += pp;
            }

        System.out.println(answer / N);
        }

    }






