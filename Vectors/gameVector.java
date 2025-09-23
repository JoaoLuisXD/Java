package Vectors;

import java.util.Locale;
import java.util.Scanner;

import entities.Game;

public class gameVector {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();

        Game[] game = new Game[n];
        double addPrice = 0;

        for (int i = 0; i < game.length; i++) 
        {
            sc.nextLine();
            System.out.print("name: ");
            String name = sc.nextLine();
            System.out.print("price: ");
            double price = sc.nextDouble();
            game[i] = new Game(name, price);
            addPrice += game[i].getPrice();
        }

        double avg = addPrice / n;
        System.out.println("Avg: " + avg);

        sc.close();
    }
}
