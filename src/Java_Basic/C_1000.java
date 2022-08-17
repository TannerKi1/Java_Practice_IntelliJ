package Java_Basic;
import java.io.*;
import java.util.StringTokenizer;

public class C_1000 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < 1000; i++) {
            String k = st.nextToken();
                if (k.charAt(0) == 'q'){
                    System.out.println('q');
                    break;
                }
                else {
                    System.out.println(k);
                }
            }

        }




    }

