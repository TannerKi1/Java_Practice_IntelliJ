package Good_Solution;

public class Flag만들어서_루프탈출하기 {
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
