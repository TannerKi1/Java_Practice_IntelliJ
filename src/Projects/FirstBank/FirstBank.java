package Projects.FirstBank;

public class FirstBank {
    public static void main(String[] args){

        // 아직 Account Class를 만들지 않아서 그럼. 이후 Account 클래스는 parameter로 String 이름, String 계좌번호가 들어갈 예정
        Account tim = new Account("Tim Statler", "A00001");

        // Account Class에 있는 method중 하나로, 어떤 메뉴가 있는 지 보여주는 것이 될 거임.
        tim.showMenu();

    }
}
