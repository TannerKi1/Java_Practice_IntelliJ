package BOJ_Java.F6;
import java.util.*;
import java.io.*;

public class BOJ_2869_달팽이는올라가고싶다_S5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // A: 하루 올라가는 거리 B: 잘 때 떨어지는 거리 V : 총 가야하는 거리
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());


        // 낮에 가서 도착지에 도달하면 자지 않아도 되기 때문에, 낮에 1번 가는 걸 빼고 계산해준다.
        // 마지막날 낮에 가는 거리를 빼면 딱 맞아떨어지는 경우.
        if ((V - A) % (A - B) == 0){

            System.out.println((V - A) / (A - B) + 1);

        }

        // 마지막날에 낮에 가는 거리를 빼도 거리가 살짝 남아 하루가 더 걸리는 경우
        else{
            System.out.println((V - A) / (A - B) + 2);
        }







    }
}
