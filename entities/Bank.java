package entities;

public class Bank {
    private String numberAccount;
    private String name;
    private double value;
    
    public Bank (String numberAccount, String name, double value)
    {
        this.numberAccount = numberAccount;
        this.name = name;
        this.value = value;
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

}
