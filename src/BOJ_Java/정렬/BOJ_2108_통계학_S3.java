package BOJ_Java.정렬;
import java.io.*;
import java.util.*;


public class BOJ_2108_통계학_S3 {

//    public static int mostFrequent(int[] arr, int n){
//        int maxCount = -1;
//        int maxNum = -1;
//        ArrayList<Integer> arr2 = new ArrayList<>();
//
//        for (int k = 0; k < n; k++){
//            int count = 0;
//            for (int l = 0; l < n; l++){
//                if(arr[k] == arr[l]){
//                    count += 1;
//                }
//            } if (count > maxCount){
//                maxCount = count;
//                maxNum = arr[k];
//            }
//        }
//        return maxNum;
//    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        // 산술평균 출력
        double ans = sum / n;
        System.out.printf("%.0f", ans);
        System.out.println();

        // 중앙값 출력
        System.out.println(arr[n /2]);

        /* 최빈값 출력
        무엇이 많이 나왔는지 어떻게 알 수 있을까? Google: Most frequent element in an array를 찾으면 해결 가능
        그러나 값이 중복된 경우에는 어떻게 하는 지 생각이 떠오르지 않음 */

        // 범위를 출력 (최댓값과 최솟값사이)
        System.out.println(arr[n - 1] - arr[0]);
    }
}
