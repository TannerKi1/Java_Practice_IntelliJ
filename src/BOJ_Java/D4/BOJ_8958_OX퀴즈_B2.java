package BOJ_Java.D4;
import java.io.*;
import java.util.*;

public class BOJ_8958_OX퀴즈_B2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String a = sc.next();

            double ans = 0;
            int cnt = 0;

            for (int j = 0; j < a.length(); j++){
                if (a.charAt(j) == 'O'){
                    cnt += 1;
                }
                else if (a.charAt(j) == 'X'){
                    ans += 0.5 * cnt * (cnt + 1);
                    cnt = 0;
                }
            }
            ans += 0.5 * cnt * (cnt + 1);
            System.out.println((int)ans);
            }
        }


    }

