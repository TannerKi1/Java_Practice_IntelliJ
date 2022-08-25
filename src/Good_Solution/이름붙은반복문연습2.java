package Good_Solution;

import java.util.*;

public class 이름붙은반복문연습2 {

    public static void main(String[] args) {

        int menu = 0, num = 0;

        Scanner scanner = new Scanner(System.in);

        outer : while(true) {
            System.out.println("(1) 스파게티");
            System.out.println("(2) 떡볶이");
            System.out.println("(3) 라면");
            System.out.print("원하는 메뉴 1~3중에서 선택하세요. (종료:0)> ");

            menu = scanner.nextInt();

            if (menu==0) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("보기에 없는 메뉴입니다. 다시 선택해 주십시오.");
                continue;
            }

            // 영원히 for문의 굴레에 갖혀버렸다.
            for (;;) { // 여기 오타였네...
                System.out.print("계산할 값을 입력하세요. (계산종료:0, 전체종료:99)> ");
                num = scanner.nextInt();

                if (num==0) {
                    break; // for문을 탈출했지만 정작 while문을 탈출하지 못 한 모습이다...
                }//if1
                if (num==99) {
                    break outer;
                }//if2

                switch (menu) {
                    case 1 :
                        System.out.println("계산할 금액="+num*num);
                        break;
                    case 2 :
                        System.out.println("계산할 금액="+Math.sqrt(num));
                        break;
                    case 3 :
                        System.out.println("계산할 금액="+Math.log(num));
                        break;
                }//switch
            }//for
        }//while outer
    }//main

}