package BOJ_Java.f6;
import java.util.*;

public class BOJ_11654_아스키코드 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 기본적으로 Scanner Class로 받아오는 친구는 String 형이다
        String a = sc.next();

        // 따라서 해당 String 형을 char형으로 바꾸어주고
        char b = a.charAt(0);

        // 앞에 (int)를 붙이면 자동으로 아스키코드에 해당하는 숫자로 바뀌게 된다.
        int num = (int) b;

        // 만약 역으로 바꾸어 보고 싶으면 (char)을 쓰면 된다...!

        System.out.println(num);

    }
}
