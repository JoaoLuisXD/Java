package Inheritance.Overhide;

public class SavingsAccount extends Account{
    
    Double interestRate;
    
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate){
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void uptadeBalance(){
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(Double amount) {
        balance -= amount;
    }
}
