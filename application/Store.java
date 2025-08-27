package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;
public class Store {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products item = new Products();
        System.out.print("Enter the name of the product: ");
        item.name = sc.nextLine();
        System.out.print("Enter the price: ");
        item.price = sc.nextDouble();
        System.out.print("Enter the quantity in stock: ");
        item.quantity = sc.nextInt();
        
        System.out.println(item);

        System.out.print("Enter the number of products to be add in stock: ");
        item.plus = sc.nextInt();
        item.UpdateStock();
        System.out.println("Updated: " + item);
        
        System.out.print("Enter the number of products to be remove from stock: ");
        item.remove = sc.nextInt();
        item.RemoveStock();

        System.out.println("Updated: " + item);
        sc.close();
    }
}
