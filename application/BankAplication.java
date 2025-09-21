package application;

import java.util.Scanner;

import entities.Bank;

public class BankAplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank account;

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        int choose = sc.next().charAt(0);
        double value = 0;
        if (choose == 'y' || choose == 'Y') 
        {
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();
            account = new Bank(accountNumber, name, value);
            
        }
        else 
        {
            account = new Bank(accountNumber, name);
        }
        System.out.println();

        System.out.println("Account data: ");
        account.accountData();        

        System.out.println();
        System.out.print("Enter a deposit value: ");
        value = sc.nextDouble();
        account.depositAccount(value);
        System.out.println();
        System.out.println("Updated account data: ");
        System.out.print("Account " + account.getNumberAccount() + ", Holder: " + account.getName() + ", Balance: $ " + account.getValue());
        System.out.println();

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withDrawAccount(value);
        System.out.println();
        System.out.println("Updated account data: ");
        System.out.print("Account " + account.getNumberAccount() + ", Holder: " + account.getName() + ", Balance: $ " + account.getValue());
        System.out.println();

        sc.close();
    }
}
