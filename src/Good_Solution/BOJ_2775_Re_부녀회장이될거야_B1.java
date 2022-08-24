package Good_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2775_Re_부녀회장이될거야_B1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        // T만큼 반복해야함
        for (int i = 0; i < T; i++) {

            // 2D Array를 만들어주자
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            // 높이가 k층이고, 가로가 n인 상황...
            int[][] grid = new int[k + 1][n];

            // 0층 주민은 1부터 입주시키기
            for (int a = 0; a < 1; a++) {
                for (int b = 0; b < n; b++) {
                    grid[a][b] = b + 1;
                }
            }

            // 1호 주민은 언제나 1명 입주시키기
            for (int c = 0; c < k + 1; c++) {
                for (int d = 0; d < 1; d++) {
                    grid[c][d] = 1;
                }
            }




            // dp로 나머지 빈칸 채우기. 한 층은 아래층과 바로 옆의 층의 합
            for (int r = 1; r < k + 1; r++) {
                for (int p = 1; p < n; p++) {
                    grid[r][p] = grid[r - 1][p] + grid[r][p - 1];
                }
            }

            // T만큼 for문이 돌 때마다 답 출력
            System.out.println(grid[k][n-1]);
        }
    }
}