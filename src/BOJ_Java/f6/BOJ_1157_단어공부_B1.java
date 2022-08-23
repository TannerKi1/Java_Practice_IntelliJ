package BOJ_Java.f6;
import java.io.*;

public class BOJ_1157_단어공부_B1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 알파벳 A부터 Z까지 카운트할 배열을 선언함 //
        int[] num = new int[26];

        // 모든 문자를 대문자로 변환 //
        str = str.toUpperCase();

        // for문을 돌면서 문자하나씩 따오기, 그다음에 0 ~ 26에 대응시키기 위해 - 65를 빼준다.//
        for (int i = 0; i < str.length(); i++){
            char A = str.charAt(i);
            int b = ((int) A - 65);
            num[b] += 1;
        }

        // 가장 많이 나온 횟수를 세야하기 때문에 저장할 수 있는 기준 -1을 넣어준다.//
        int max_num = -1;
        char ans = '?';

        // 만약 max num이 바뀌게 되면 해당 j의 인덱스에 65를 더한 값(대문자)가 ans로 바뀌게 된다.
        for (int j = 0; j < 26; j++){
            if (num[j] > max_num){
                max_num = num[j];
                ans = (char) (j + 65);
            }else if (num[j] == max_num){
                ans = '?';
            }
        }

        System.out.println(ans);

    }
}
