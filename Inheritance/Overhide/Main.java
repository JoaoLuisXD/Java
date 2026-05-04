package Inheritance.Overhide;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1, "Joao", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(2, "Isa", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(3, "Giselle", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
