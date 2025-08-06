package Data_input;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_entrada_dados3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A,B,C,D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int difference = (A*B - C*D);

        System.out.printf("The difference between the variables is: %d",difference);

        sc.close();
    }
}
