package entities;

public class Products {
    private String name;
    private double price;
    private int quantity;

    public Products(){}

    public Products(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Products(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    
    // get/set (name)
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    // get/set (price)
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    // get quantity

    public int getQuantity()
    {
        return quantity;
    }



    public void PrintProductData(){
        System.out.println("Product: " + name);
        System.out.println("Units: " + quantity);
        System.out.println("Price: " + price);
    }

    public double TotalPrice(){
        return price * quantity;
    }
    public double UpdateStock(int quantity){
        return this.quantity += quantity;
    }
    public int RemoveStock(int quantity){
        return this.quantity -= quantity;
    }
    public String toString(){
        return name
        + ", $"
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", TotalPrice());
    }
}
