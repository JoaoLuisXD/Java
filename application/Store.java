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
        
        Products item = new Products(name, price);

        // TESTING PRIVATE CALLS

        /* item.setName("computer");
        System.out.println("new name: " + item.getName());

        item.setPrice(1200);
        System.out.println("new price: " + item.getPrice());
        
        System.out.println("quantity in stock: " + item.getQuantity());
        */

        System.out.println(item);

        System.out.print("Enter the number of products to be add in stock: ");
        int quantity = sc.nextInt();
        item.UpdateStock(quantity);
        System.out.println("Updated: " + item);
        
        System.out.print("Enter the number of products to be remove from stock: ");
        quantity = sc.nextInt();
        item.RemoveStock(quantity);

        System.out.println("Updated: " + item);
        sc.close();
    }
}
