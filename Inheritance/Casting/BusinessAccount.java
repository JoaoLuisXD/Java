package Inheritance.Casting;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit){
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if (amount <= loanLimit) {
            amount += amount - 10.0;
        }
    }

    public Double getLoanLimit() {
        return loanLimit;
    }
}
