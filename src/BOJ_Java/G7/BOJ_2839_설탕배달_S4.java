package BOJ_Java.G7;
import java.util.*;

public class BOJ_2839_설탕배달_S4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배달해야할 설탕 입력받기
        int n = sc.nextInt();

        // 3, 5키로 설탕 목록 만들기
        int[] sugar= {3, 5};

        // 배달 가능한 설탕목록 dp 만들기 (0키로부터 있으니까 n + 1로 만들어주기)
        int[] dp = new int[n + 1];

        // 최솟값을 찾는 문제기에 가장 큰 값으로 초기화 시켜주었다. 이게 최선인가..? 파이썬 처럼 * 으로 못 만드는 지 체크해보기
        for (int i = 0; i < n + 1; i++){
            dp[i] = 9999;
        }

        // 사전 준비 끝, dp 값 초기화 시켜주기
        dp[0] = 0;

        // 시간 많이 잡아먹었던 부분, k의 시작값은 sugar 배열에서 유동적으로 가져와야 이후 k-sugar[i]에서 범위 미스가 나지 않는다 //
        for (int i = 0; i < sugar.length; i++) {
            for (int k = sugar[i]; k < n + 1; k++) {
                dp[k] = Math.min(dp[k], dp[k - sugar[i]] + 1);
            }
        }

        // 만들 수 없는 9999의 경우에는 -1로 출력해주기
        if (dp[n] != 9999){
            System.out.print(dp[n]);
        }
        else {
            System.out.print(-1);
        }

    }
}
