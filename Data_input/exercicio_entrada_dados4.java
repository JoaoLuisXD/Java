package Data_input;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_entrada_dados4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id,hours_worked;
        double wage_per_hour;

        id = sc.nextInt();
        hours_worked = sc.nextInt();
        wage_per_hour = sc.nextDouble();

        double calculeted_salary = hours_worked * wage_per_hour;

        System.out.printf("Number: %d\nSalary: %.2f",id,calculeted_salary);

        sc.close();
    }
}
