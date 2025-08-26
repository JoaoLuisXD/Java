package entities;

public class Products {
    public String name;
    public double price;
    public int quantity;
    public int plus;
    public int remove;

    public void PrintProductData(){
        System.out.println("Product: " + name);
        System.out.println("Units: " + quantity);
        System.out.println("Price: " + price);
    }

    public double TotalPrice(){
        return price * quantity;
    }
    public double UpdateStock(){
        return quantity += plus;
    }
    public int RemoveStock(){
        return quantity -= remove;
    }
}
