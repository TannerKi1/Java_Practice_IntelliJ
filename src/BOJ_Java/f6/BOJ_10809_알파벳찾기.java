package BOJ_Java.f6;
import java.io.*;

public class BOJ_10809_알파벳찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr = br.readLine();

        // for문을 돌 때도 char 을 통해 a ~ z를 빠르게 순회할 수 있다. i+1 = b가 된다는 걸 잘 기억해 놓자.
        for (char i = 'a'; i <= 'z'; i++){

            // String의 기능 중 하나인 .indexOf()를 활용하였다.
            System.out.print(arr.indexOf(i) + " ");

        }


    }
}
