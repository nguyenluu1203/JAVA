package Final.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the balance: ");
        double balance = a.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double rate = a.nextDouble();
        Bank myBank = new Bank(balance,rate);
        double monthlyInterest = myBank.calculateInterest(balance, rate);
        System.out.println("Monthly Interest: $" + monthlyInterest);


    }
}
