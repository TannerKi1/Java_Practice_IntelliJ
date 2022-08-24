package BOJ_Java.f6;
import java.util.*;
import java.io.*;

public class BOJ_5622_다이얼_B2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 다이얼을 돌려야하는 문자를 받아옴
        String str = br.readLine();

        // 숫자를 쌓을 저장값 선언
        int num = 0;

        // for문 돌면서 일치하면 value 값 가져오기
        for (int i = 0; i < str.length(); i++){
            char X = str.charAt(i);

            if ('A' <= X && X <= 'C'){
                num += 3;
            }

            if ('D' <= X && X <= 'F'){
                num += 4;
            }

            if ('G' <= X && X <= 'I'){
                num += 5;
            }

            if ('J' <= X && X <= 'L'){
                num += 6;
            }

            if ('M' <= X && X <= 'O'){
                num += 7;
            }

            if ('P' <= X && X <= 'S'){
                num += 8;
            }

            if ('T' <= X && X <= 'V'){
                num += 9;
            }

            if ('W' <= X && X <= 'Z'){
                num += 10;
            }
        }

        // 정답 출력
        System.out.println(num);
    }
}
