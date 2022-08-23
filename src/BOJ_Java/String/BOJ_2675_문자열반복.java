package BOJ_Java.String;
import java.util.*;
import java.io.*;

public class BOJ_2675_문자열반복 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반복할 횟수를 이렇게 받아주고
        int n = sc.nextInt();

        // for문 돌릴 횟수를 괄호 안에 지정해준다.
        for (int i = 0; i < n; i++) {

            // next()와 nextLine()의 차이는 뒤의 공백까지 받아오냐 유무의 차이
            int a = sc.nextInt();
            String b = sc.next();

            // 이후 앞의 a만큼 반복출력해야하기에 for문 내부에서 a에 도달할 때까지 같은 문자를 계속 만들어준다.
            for (int j = 0; j < b.length(); j++) {
                for (int k = 0; k < a; k++) {
                    System.out.print(b.charAt(j));
                }
            }

            // 이후 줄바꿈을 위한 인쇄
            System.out.println();
        }
    }
}