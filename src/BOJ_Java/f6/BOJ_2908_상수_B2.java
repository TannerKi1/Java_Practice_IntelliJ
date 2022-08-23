package BOJ_Java.f6;
import java.util.*;
import java.io.*;

public class BOJ_2908_상수_B2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 띄어쓰기를 단위로 두 문자열을 저장해준다 //
        String str1 = sc.next();
        String str2 = sc.next();

        /* num1과 num2를 각각 뒤집어서 저장할 방법 생각하기
         뒤에서부터 읽으면 어떨까? */

        // 문자열을 쌓을 빈 문자열 선언//
        String str3 = "";
        String str4 = "";

        /* for문을 돌면서 index 역순으로 쌓아준다
         길이가 3인 걸 몰랐다면, str1.length()를 써도 됐을 것 */
        for (int i = str1.length() - 1; i >= 0 ; i--){
            char A = str1.charAt(i);
            str3 += A;
        }

        // 옆의 문자에도 동일한 방법 적용 //
        for (int j = str2.length() - 1; j >= 0; j--){
            char B = str2.charAt(j);
            str4 += B;
        }

        // 이후 문자열을 정수열로 변환 //
        int num1 = Integer.parseInt(str3);
        int num2 = Integer.parseInt(str4);

        // Math.max()를 사용하여 더 큰 값을 리턴 //
        System.out.println(Math.max(num1, num2));

    }
}
