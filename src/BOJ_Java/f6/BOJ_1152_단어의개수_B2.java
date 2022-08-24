package BOJ_Java.f6;
import java.util.*;
import java.io.*;

public class BOJ_1152_단어의개수_B2 {
    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄로 들어온 데이터이기 때문에 br.readLine()으로 통채로 읽어준다
        StringTokenizer st = new StringTokenizer(br.readLine());

        // StringTokenizer가 제공하는 .countTokens()를 써준다
        int num = st.countTokens();

        // 답안 출력 완료
        System.out.println(num);

    }
}
