package Java_Basic;
import java.io.*;

public class C_1079 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= a; i ++){
            if (i % 2 == 0){
                count += i;
            }

        }
        System.out.println(count);

    }
}