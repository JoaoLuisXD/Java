package Data_input;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_entrada_dados6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C;

        System.out.print("A: ");
        A = sc.nextDouble();
        System.out.print("B: ");
        B = sc.nextDouble();
        System.out.print("C: ");
        C = sc.nextDouble();

        double triangle_area = (A * C) / 2;
        double circle_area = Math.pow(C, 2) * 3.14159;
        double trapeze_area = (A + B) * C/2;
        double square_area = Math.pow(B, 2);
        double rectangle_area = A * B;

        System.out.println("Triangle: " + triangle_area);
        System.out.println("Circle: " + circle_area);
        System.out.println("Trapeze: " + trapeze_area);
        System.out.println("Square: " + square_area);
        System.out.println("Rectangle: " + rectangle_area);
        
        sc.close();
    }
}
