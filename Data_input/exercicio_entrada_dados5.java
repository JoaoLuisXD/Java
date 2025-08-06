package Data_input;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_entrada_dados5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id_part1, n_of_units1;
        int id_part2, n_of_units2;
        double unit_value1, unit_value2;

        System.out.println("Enter the part ID, number of pieces and unit value of the part one");
        System.out.print("ID: ");
        id_part1 = sc.nextInt();
        System.out.print("Number of units: ");
        n_of_units1 = sc.nextInt();
        System.out.print("Unit value: ");
        unit_value1 = sc.nextDouble();

        
        System.out.println("Enter the part ID, number of pieces and unit value of the part two");
        System.out.print("ID: ");
        id_part2 = sc.nextInt();
        System.out.print("Number of units: ");
        n_of_units2 = sc.nextInt();
        System.out.print("Unit value: ");
        unit_value2 = sc.nextDouble();

        double aggregate_value_p1 = n_of_units1*unit_value1;
        double aggregate_value_p2 = n_of_units2*unit_value2;
        double total_value = aggregate_value_p1 + aggregate_value_p2;
        
        System.out.println("ID Product 1: " + id_part1);
        System.out.printf("Aggregate value of product 1: %.2f\n",aggregate_value_p1);
        System.out.println("ID Product 2: " + id_part2);
        System.out.printf("Aggregate value of product 2: %.2f\n",aggregate_value_p2);
        System.out.printf("The total value: %.2f\n",total_value);

        sc.close();
    }    
}
