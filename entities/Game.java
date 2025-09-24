package entities;

public class Game {
    String name;
    double price;

    public Game(String name, double price)
    {
        this.name = name;
        this.price = price;
    } 

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
