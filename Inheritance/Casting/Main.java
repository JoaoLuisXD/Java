package Inheritance.Casting;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1, "Joao", 1000.0);
        BusinessAccount acc2 = new BusinessAccount(2, "Isa", 2000.0, 5000.0);
        SavingsAccount acc3 = new SavingsAccount(3, "Giselle", 500.0, 0.1);

        // UPERCASTING

        Account acc4 = acc2;  // no problem
        acc4.getBalance();
        Account acc5 = acc3;  // no problem
        acc5.getBalance();

        // DOWNCASTING

        if (acc3 instanceof SavingsAccount) { // verify instance
            SavingsAccount acc7 = (SavingsAccount)acc3; // casting
            acc7.uptadeBalance();
            System.out.println("UPDATED");
        }

        if(acc1 instanceof BusinessAccount){ // verify instance
            BusinessAccount acc8 = (BusinessAccount)acc1; // casting
            acc8.loan(100.0);
            System.out.println("LOAN");
        }

    }
}
