package Java_Basic;

public class practice {
    public static void main(String[] args) {
        String[][] car = new String[3][3];

        car[0][0] = "fod";
        car[0][1] = "fff";
        car[0][2] = "aaa";
        car[1][0] = "bbb";
        car[1][1] = "아반테";
        car[1][2] = "버스";
        car[2][0] = "기차";
        car[2][1] = "자전거";
        car[2][2] = "하늘";

        for (int i = 0; i < 3; i ++){
            System.out.println();
            for (int j = 0; j <3; j ++){
                System.out.print(car[i][j] + " ");
            }
        }

    }
}
