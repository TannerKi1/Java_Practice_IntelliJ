package BOJ_Java.정렬;
import java.util.*;
import java.io.*;

public class BOJ_25305_커트라인_B2 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc = new StringTokenizer(br.readLine());

        // n과 k를 Token 단위로 입력받음
        int n = Integer.parseInt(sc.nextToken());
        int k = Integer.parseInt(sc.nextToken());

        // 줄 읽음을 통해서 한번에 String Array로 받음
        String[] arr = br.readLine().split(" " );

        // 이후 int Array를 선언하고, String Array를 돌면서 하나씩 인트로 바꿔서 저장받음
        int[] arr2 = new int[arr.length]; // array니까 length로 세야함

        for (int i = 0; i < arr.length; i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }

        // 이후 Arrays 클래스를 이용해 정렬
        Arrays.sort(arr2);

        // 정답 출력
        System.out.println(arr2[n - k]);




    }
}
