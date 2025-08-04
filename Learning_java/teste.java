package Learning_java;
import java.util.Locale;
public class teste {
    
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.print("Tudo Bem ? ");
        System.out.println("Estou Otimo");

        System.out.println("Quantos anos você tem ?");
        int x = 20;
        System.out.println(x);

        System.out.println("Quanto é um video game ?");
        double y = 2799.99;
        System.out.println(y);
        
        Locale.setDefault(Locale.US);
        System.out.println("Qual o valor de PI ?");
        double z = 3.1415;
        System.out.printf("%.2f%n", z);
        System.out.printf("%.4f\n", z); //o mesmo que o de cima, porém imprindo 4 e com \n.
        
        System.out.println("Qual a sua altura ?");
        float w = 1.73f;
        System.out.println("Eu tenho " + w + " de altura");
        System.out.printf("Eu tenho %.2f de altura\n", w);

        System.out.println("Qual o seu nome?");
        String nome = "Joao";
        System.out.println(nome);
        
        System.out.printf("\nMeu nome e: %s\nTenho: %d anos\nE minha altura e: %.2f\n", nome,x,w);

        
        
    }

}
