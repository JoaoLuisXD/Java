package Vectors;

import java.util.Locale;
import java.util.Scanner;

public class exercise4_vectors {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        rent[] Rent = new rent[10];

        for (int i = 1; i <= n; i++) {
            System.out.println("Room #" + i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int number = sc.nextInt();

            rent r = new rent(name, email);
            Rent[number] = r;

        }

        System.out.println("Busy rooms:");
        for (int i = 1; i < Rent.length; i++) {
            if (Rent[i] != null) {
                System.out.println(i + ": " + Rent[i]);
            }
        }

        sc.close();
    }
}
