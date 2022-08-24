package Projects.A_BankProgram.SecondBank;
import java.util.Scanner; // 입력값을 받아야 하니까.

public class Account {

    // field 위치니까, 무슨 값들을 사용할 것인지 미리 형태를 저장해놓기
    String accountName;
    String accountID;
    float balance;
    float lastTransaction;
    int visitCount;
    int validPassword;

    // 가장 메인이 되는 method 부르기
    Account(String name, String ID, int PassWord) {
        accountName = name;
        accountID = ID;
        validPassword = PassWord;
    }

    // deposit이라는 method 잡아주기
    void deposit(float dMoney) {
        if (dMoney > 0) {
            balance += dMoney;
            lastTransaction = dMoney;
            System.out.println("Thank you very much " + accountName + ".");
            System.out.println(dMoney + " has been deposited.");
            System.out.println("Have a nice day!!");

        } else {
            System.out.println("That money can't be deposited");

        }
    }

    // 돈을 찾는 method. 여기에 password 기능을 추가해보자 -> 아니지, checkPassword이라는 함수를 만들어보자
    void withdraw(float wMoney) {
        if (wMoney > 0 && wMoney <= balance) {
            balance -= wMoney;
            lastTransaction = -wMoney;
            System.out.println("Thank you very much, Mr " + accountName + " .");
            System.out.println("You just took " + wMoney + " from us.");
        } else {
            System.out.println("Sorry Error occured!");
        }
    }

    void checkBalance() {
        System.out.println("Your current balance is " + balance + " .");
    }

    void checkTransaction() {
        System.out.println(lastTransaction);
    }

    void checkInterest(int year) {
        int month = year * 12;
        double interestRate = 0.05;
        System.out.println("Your interest is going to be...");
        System.out.println(balance * (1 + interestRate) * month);
    }

    void checkPassword(int numPassword){

        if (validPassword == numPassword){
            System.out.println("Correct Password");
            System.out.println("Access Approved!!!");
        }

        else{
            System.out.println("Wrong Password");
            System.out.println("You cannot access to the account.");
            welcome();
        }
    }

//    void giveMoney(){
//
//    }




    // welcome method 정의해주기

    void welcome() {
        visitCount += 1;

        System.out.println("=========================");
        System.out.println("Welcome to Second Bank. " + accountName + " is our VIP.");
        System.out.println("What do you want? ");

        System.out.println("==================================");
        System.out.println("A: Deposit money to Second Bank.");
        System.out.println("B: Withdraw money from Second Bank.");
        System.out.println("C: Check current balance of your account.");
        System.out.println("D: Confirm latest Transaction.");
        System.out.println("E: I want to know Future Balance");
        System.out.println("F: I want to leave. Bye Bye.");
        System.out.println("==================================");
        System.out.println("Please choose the button: ");
        Scanner sc = new Scanner(System.in);

        char option = '\0';

        // 소문자로 들어와도 대문자로 알아서 바꿔주는 기능이 필요함.
        String input = sc.next();
        char option1 = Character.toUpperCase(input.charAt(0));

        do {
            switch (option1) {
                case 'A' :
                    System.out.println("===================");
                    System.out.println("How much do you want to put in?: ");
                    deposit(sc.nextFloat());
                    break;

                case 'B' :
                    System.out.println("====================");
                    System.out.println("Please type in your password: ____");
                    checkPassword(sc.nextInt());
                    System.out.println("How much do you want to withdraw?: ");
                    withdraw(sc.nextFloat());
                    break;

                case 'C' :
                    System.out.println("====================");
                    System.out.println("Could you wait for me...?");
                    System.out.println("Please type in your password: ____");
                    checkPassword(sc.nextInt());
                    checkBalance();
                    break;

                case 'D' :
                    System.out.println("=====================");
                    System.out.println("Please type in your password: ____");
                    checkPassword(sc.nextInt());
                    System.out.println("Okay let me check the last Transaction");
                    checkTransaction();
                    break;

                case 'E' :
                    System.out.println("======================");
                    System.out.println("How many years do you want to continue?");
                    checkInterest(sc.nextInt());
                    break;

                case 'F':
                    System.out.println("======================");
                    break;

                default :
                    System.out.println("=======================");
                    System.out.println("Please press the right button from A ~ Z!");
            }
        }while (option1 != 'F');
        System.out.println("Thank you for banking with us!");
    }
}
