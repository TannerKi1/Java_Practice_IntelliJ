package BOJ_Java.정렬;
import java.util.*;
import java.io.*;

public class BOJ_2750_수정렬하기_B2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 가장 위에 있는 n으로 받아오고, n의 길이를 가지는 int arr 설정
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        // for문을 돌면서 1줄씩 주어지는 int값을 배열 내부 값으로 갱신
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 오름차순으로 정렬
        Arrays.sort(arr);

        // int arr를 돌면서 하나씩 출력
        for (int j = 0; j < n; j++){
            System.out.println(arr[j]);
        }


    }
}
