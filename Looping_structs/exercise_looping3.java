package Looping_structs;

import java.util.Scanner;

public class exercise_looping3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        int choice;
        System.out.println("------------GAS STATION------------");
        System.out.println("|MENU|");
        System.out.println("1 - Alcohol\n2 - Gasoline\n3 - Diesel\n4 - END");
        System.out.print("Enter the fuel you want to use to refuel: ");
        choice = sc.nextInt();

        while (choice != 4) 
        {
            switch (choice) {
                case 1:
                    alcohol++;
                    break;
                case 2:
                    gasoline++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Error, try again");
                    break;
            }    
            System.out.println("---------------------");
            System.out.println("Alcohol: " + alcohol);
            System.out.println("Gasoline: " + gasoline);
            System.out.println("Diesel: " + diesel);
            System.out.println("---------------------");
            System.out.print("Enter the fuel you want to use to refuel: ");
            choice = sc.nextInt();
        }
        System.out.println("Thank you!");
        sc.close();
    }
}
