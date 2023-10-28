import detail.Detail;
import java.util.Scanner;
import java.util.*;

public class Bank {
    static long balance = 0;
    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {
        defaultMenu();
    }

    private static void defaultMenu() {
        Detail detail = new Detail();
        int cardNo = detail.setCardno(1234);
        int atmcardpin = detail.setAtmpin(1234);
        System.out.println("Welcome to the Bank Of Lucknow");
        System.out.println("Enter Your Card No");
        int atmcard = scanner.nextInt();
        System.out.println("Enter Your Secret Pin");
        int cardpin = scanner.nextInt();
        if (atmcard == cardNo && cardpin == atmcardpin){
            home();
        }else {
            System.out.println("Please enter correct detail.");
            main(null);
        }
    }

    private static void home() {
        System.out.print(
                "\n 1.Balance Enquiry"
                        + "\n 2.Deposit Money"
                        + "\n 3.Withdraw Money"
                        + "\n 4.Exit\n");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                balanceEnquiry();
                break;
            case 2:
                depositMoney();
                break;
            case 3:
                withdrawMoney();
                break;
            case 4:
                exitUser();
                break;
            default:
                System.out.println("Please Check Entered Option");
        }
    }

    private static void exitUser() {
        main(null);
    }

    private static void balanceEnquiry() {
        System.out.println("Available Balance:" + balance);
        home();
    }

    private static void withdrawMoney() {
        System.out.println("Enter Your Withdraw Amount");
        int withdrawAmount =  scanner.nextInt();
        balance = balance - withdrawAmount;
        System.out.println("Your Amount Deposited:" + withdrawAmount);
        System.out.println("Total Amount:" + balance);
        home();
    }

    private static void depositMoney() {
        System.out.println("\n 1. 500 \n 2. Custom Amount");
        int selectOption = scanner.nextInt();
        switch (selectOption){
            case 1: depositMoneyFiveHundred();
            break;
            case 2: customAmount();
            break;
            default:
                System.out.println("Enter Correct Amount");
      home();
    }
}

    private static void customAmount() {
        System.out.println("Enter Your Deposit Amount");
        int customDepositAmount =  scanner.nextInt();
        balance = balance + customDepositAmount;
        System.out.println("Your Amount Deposited:" + customDepositAmount);
        System.out.println("Total Amount:" + balance);
        home();
    }
    private static void depositMoneyFiveHundred() {
        int fiveHundred = 500;
        balance =  balance + fiveHundred;
        System.out.println("Your Amount Deposited:" + fiveHundred);
        System.out.println("Total Amount:" + balance);
        home();
    }

}
