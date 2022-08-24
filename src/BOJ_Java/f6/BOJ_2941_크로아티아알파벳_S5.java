package BOJ_Java.f6;
import java.util.*;
import java.io.*;

public class BOJ_2941_크로아티아알파벳_S5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 검사해야하는 문자열은 str에 저장되어 있음 //
        String str = br.readLine();

        // .replace(변환전, 변환후) 를 사용해서 1글자로 바꿔준다 //
        str = str.replace("c=", "*");
        str = str.replace("c-", "*");
        str = str.replace("dz=", "*");
        str = str.replace("d-", "*");
        str = str.replace("lj", "*");
        str = str.replace("nj", "*");
        str = str.replace("s=", "*");
        str = str.replace("z=", "*");

        // 답을 출력해준다 //
        System.out.println(str.length());





    }
}
