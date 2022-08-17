package Java_Basic;
import java.util.StringTokenizer;
import java.io.*;

public class C_1064 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int min_value = 100000;

        int a = 3;

        for (int i = 0; i < a; i++){
            int A = Integer.parseInt(st.nextToken());
            if (A < min_value){
                min_value = A;
            }
        }

        System.out.print(min_value);


    }
}
