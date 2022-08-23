package Java_Algo.d;
import java.io.*;
import java.util.HashSet;

public class BOJ_3052_나머지_B2_Implementation {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 10;
        HashSet<Integer> set = new HashSet<Integer> (); //Set 선언

        for (int i = 0; i < N; i++){
            int k = Integer.parseInt(br.readLine());
            set.add(k % 42);
        }

        System.out.println(set.size()); // set의 크기는 .size()를 이용한다.


    }
}
