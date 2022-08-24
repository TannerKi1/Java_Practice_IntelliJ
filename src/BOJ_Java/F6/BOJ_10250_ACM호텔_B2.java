package BOJ_Java.F6;
import java.util.*;
import java.io.*;

public class BOJ_10250_ACM호텔_B2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            StringTokenizer sc = new StringTokenizer(br.readLine());

            // 높이, 넓이, 방문자 차례 입력
            int h = Integer.parseInt(sc.nextToken());
            int w = Integer.parseInt(sc.nextToken());
            int n = Integer.parseInt(sc.nextToken());

            // 딱 맞게 끝나는 경우와, 아닌 경우를 구분해줘야함. 층수가 다르게 나옴
            if (n % h == 0){
                int x = h;
                int y = n / h;

                // 또한 호수가 10이 넘어가는 순간 중간 연결 0은 빼줘야함, 아니면 12034이라는 호수가 나와버릴 수가 있음. (1234가 정답)
                if (y <= 9){
                    System.out.println(Integer.toString(x) + '0' + Integer.toString(y));
                }
                else{
                    System.out.println(Integer.toString(x) + Integer.toString(y));
                }
            }
            // 마찬가지로 나머지가 발생한다면,
            else{
                int x = n % h;
                int y = 1 + (n / h);

                // 위와 마찬가지로 0 등을 고려하여서 인쇄
                if (y <= 9){
                    System.out.println(Integer.toString(x) + '0' + Integer.toString(y));
                }
                else{
                    System.out.println(Integer.toString(x) + Integer.toString(y));
                }
            }
        }
    }
}
