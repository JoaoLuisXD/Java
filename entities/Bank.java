package entities;

public class Bank {
    private String numberAccount;
    private String name;
    private double value;
    
    public Bank (String numberAccount, String name, double initialDeposit   )
    {
        this.numberAccount = numberAccount;
        this.name = name;
        depositAccount(initialDeposit);
    }

    public Bank (String numberAccount, String name)
    {
        this.numberAccount = numberAccount;
        this.name = name;
    }
    
    public String getNumberAccount()
    {
        return numberAccount;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public double getValue()
    {
        return value;
    }

    public void depositAccount(double value)
    {
        this.value += value;
    }
    
    public void withDrawAccount(double value)
    {
        this.value -= (value + 5);
    }

    public void accountData()
    {
        System.out.print("Account " + getNumberAccount() + ", Holder: " + getName() + ", Balance: $ " + getValue());
    }

}
