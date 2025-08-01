package entrada_de_dados;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_entrada_dados1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        int result = x + y;

        System.out.println("SOMA: " + result);

        sc.close();
    }
}
