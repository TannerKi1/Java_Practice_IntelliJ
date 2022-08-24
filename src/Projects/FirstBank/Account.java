package Projects.FirstBank;
import java.util.Scanner;

public class Account {
    // field 값을 정의해준다
    // Class Variable 이라고 부름
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    // Class constructor
    Account(String name, String cid){
        customerName = name;
        customerID = cid;
    }

    // Function for Depositing money
    void deposit(int putmoney){
        if(putmoney > 0){
            balance += putmoney;
            previousTransaction = putmoney;
        }

    }

    // Function for Withdrawing money
    void withdraw(int outmoney){
        if(outmoney > 0){
            balance -= outmoney;
            previousTransaction = -outmoney;
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("You have deposited " + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Your have withdrawn " + previousTransaction);
        }
        else{
            System.out.println("No transaction occured.");
        }
    }

    void calculateInterest(int years){
        double interest = 0.01;
        int month = years * 12;
        double newBalance = balance + (balance * interest * month);
        System.out.println("Current interest rate is " + interest * 100+ "%");
        System.out.println("Your " + years + " later balance would be " + newBalance);
    }

    void showMenu(){
        char option = '\0'; // 무슨 의미?
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + customerName + " Your Customer ID is " + customerID);
        System.out.println();
        System.out.println("What would you want to do???");
        System.out.println("A: Check balance");
        System.out.println("B: Deposit money!");
        System.out.println("C: Withdraw money!");
        System.out.println("D: View previous transaction");
        System.out.println("E: Calculate Future balance");
        System.out.println("F: Exit");

        do{
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = sc.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch(option){
                case 'A':
                    System.out.println("=========================================");
                    System.out.println("Your balance is $" + balance);
                    System.out.println("=========================================");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("=========================================");
                    System.out.println("How much money do you want to deposit?: ");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("=========================================");
                    System.out.println("It is well deposited");
                    break;
                case 'C':
                    System.out.println("=========================================");
                    System.out.println("How much money do you want to withdraw?: ");
                    int wAmount = sc.nextInt();
                    withdraw(wAmount);
                    System.out.println("=========================================");
                    System.out.println("It is well withdrawn");
                    break;
                case 'D':
                    System.out.println("=========================================");
                    System.out.println(previousTransaction);
                    System.out.println("=========================================");
                    break;
                case 'E':
                    System.out.println("=========================================");
                    System.out.println("How many years do you want to put?: ");
                    int year = sc.nextInt();
                    calculateInterest(year);
                    System.out.println("=========================================");
                    break;
                case 'F':
                    System.out.println("=========================================");
                    break;
                default:
                    System.out.println("Error: invalid option. Please enter A, B, C, D, E");

            }
        }while (option != 'F');
        System.out.println("Thank you for banking with us!");


    }


}
