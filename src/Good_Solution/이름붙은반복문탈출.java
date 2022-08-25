package Good_Solution;

public class 이름붙은반복문탈출 {
    public static void main(String[] args) {
        Loop1 : for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                if(j == 5)
//                    break Loop1;
                    break;
//                    continue Lool1;
//                    continue;
                System.out.println(i * j);
            }
        }
    }
}
