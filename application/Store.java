package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;
public class Store {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the product: ");
        String name = sc.nextLine();
        System.out.print("Enter the price: ");
        double price = sc.nextDouble();
        System.out.print("Enter the quantity in stock: ");
        int quantity = sc.nextInt();

        Products item = new Products(name, price, quantity);
        
        System.out.println(item);

        System.out.print("Enter the number of products to be add in stock: ");
        quantity = sc.nextInt();
        item.UpdateStock(quantity);
        System.out.println("Updated: " + item);
        
        System.out.print("Enter the number of products to be remove from stock: ");
        quantity = sc.nextInt();
        item.RemoveStock(quantity);

        System.out.println("Updated: " + item);
        sc.close();
    }
}
