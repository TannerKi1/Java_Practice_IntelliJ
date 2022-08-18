package Java_Basic;
import java.util.StringTokenizer;
import java.io.*;



public class C_1065 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = 3;

        for (int i = 0; i < a; i++){
            String K = st.nextToken();
            int z = Integer.parseInt(K);

            if (z % 2 == 0){
                System.out.println(z);
            }

        }

    }
}
