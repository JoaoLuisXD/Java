package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_entrada_dados2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double x;
        x = sc.nextDouble();
        double result = pi * Math.pow(x,2);
        System.out.println("RESULT: " + result);
        sc.close();
    }
}
