package Java_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class C_1066 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = 3;

        for (int i = 0; i < a; i++){
            String K = st.nextToken();
            int z = Integer.parseInt(K);

            if (z % 2 == 0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }

        }

    }
}
