package entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public Products(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
