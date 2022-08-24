package BOJ_Java.D4;
import java.io.*;

public class BOJ_4344_평균은넘겠지_B1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 가장 첫줄의 숫자를 가져온다.
        int n = Integer.parseInt(br.readLine());

        // n회만큼 for문을 반복하면서, 들어온 줄 전체의 입력값을 " "를 기준으로 나눠 문자열이 저장된 array로 만들어준다.
        for (int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");

            // 가장 첫번째 있는 문자를 가져와, 정수형으로 형변환 해주고 k라는 전역변수에 넣어준다.
            int k = Integer.parseInt(str[0]);

            // 모든 학생들의 합을 구하기 위한 sum 변수를 설정해준다.//
            int sum = 0;

            // 나머지 str이라는 문자열을 돌면서 각각 문자들을 숫자로 바꾸어 sum 값에 더해준다//
            for (int j = 1; j < k + 1; j++){
                sum += Integer.parseInt(str[j]);
            }

            // 이후 전체 학생들의 숫자로 sum을 나눈 값을 avg, 즉 평균으로 저장해준다.//
            int avg = sum / k;

            // 이후 다시 한번 for문을 돌면서 아까 위에서 구한 평균을 넘는 학생들이 있을 때마다 cnt의 값을 1씩 증가시켜준다.
            int cnt = 0;
            for (int j = 1; j < k + 1; j++){
                if (Integer.parseInt(str[j]) > avg){
                    cnt += 1;
                }
            }

            // 소수점으로 값을 내야하기 때문에 자료형은 double을 선언해준다.
            double answer = cnt * 100.00 / k;

            // 소수 셋째자리까지 내야하기 때문에 %를 쓰고.3f를 붙여준다 그리고, 무엇을에 해당하는 answer를 뒤에 적어준다.//
            System.out.printf("%.3f", answer);
            System.out.println("%");
        }
    }
}