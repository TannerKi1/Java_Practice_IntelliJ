package BOJ_Java.정렬;
import java.util.*;
import java.io.*;

public class BOJ_11650_좌표정렬하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // for문을 돌면서 튜플로 한번 넣어볼까..? -> Java는 Python 처럼 튜플로 묶어서 정렬하는 게 없음. 손이 많이 감


        // 우선 2차원 Array를 정의해준다. n번 만큼 돌면서 col 0과 col 1에 각각 x 좌표와 y 좌표를 넣어준다.
        int[][] arr = new int[n][2];

        // 2차원 배열 내에 삽입 완료
        StringTokenizer st;
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // Arrays.sort()를 응용할 단계
        // 쏘팅할 arr, 람다식으로 표현한 뒷 자리
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]){
                return e1[1] - e2[1];
            }
            else{
                return e1[0] - e2[0];
            }
        }); // 뒤에도 세미콜론으로 닫아주고... 한번 arr이 정렬되었는지 확인해보자

//        for (int j = 0; j < 5; j++){
//            for (int k = 0; k < 2; k++){
//                System.out.print(arr[j][k] + " ");
//            }System.out.println();
//        }

        // String builder을 통해 값을 쌓아준다.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
