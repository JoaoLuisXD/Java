package Data_input;

import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); // scanner para receber dados do teclado
        
        int x; 
        System.out.print("Digite um numero: ");
        x = sc.nextInt(); // receber numeros inteiros
        System.out.println("\nVoce digitou: " + x);

        double y;
        System.out.print("Digite um numero double: ");
        y = sc.nextDouble(); // receber numeros double
        System.out.printf("Voce digitou: %.2f\n",y);
        

        String z;
        System.out.print("Digite um nome: ");
        z = sc.next(); // receber strings
        System.out.println("Nome digitado: " + z);

        char w;
        System.out.print("Digite um caractere: ");
        w = sc.next().charAt(0); // receber caracteres
        System.out.println("Caractere digitado: " + w);

        String s1,s2,s3;
        int n1;
        
        n1 = sc.nextInt();
        sc.nextLine(); // usado para não "engolir" o enter(\n) após a leitura do numero inteiro
        s1 = sc.nextLine();
        s2 = sc.nextLine(); // nextLine lê até a quebra de linha
        s3 = sc.nextLine();
        System.out.printf("Digitou: %d\n%s\n%s\n%s\n", n1,s1,s2,s3);


        sc.close(); //sempre fechar o scanner após o uso
    }
}
