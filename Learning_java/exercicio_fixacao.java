package Learning_java;
import java.util.Locale;

public class exercicio_fixacao {
    public static void main(String[] args) {
        

        String Product1 = "Computer";
        String Product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("\n%s, which price is $ %.2f\n", Product1, price1);
        System.out.printf("%s, wichh price is $ %.2f\n", Product2, price2);
        
        System.out.printf("\n%d years old, code %d and gender: %c\n", age, code, gender);

        System.out.printf("\nMeasue with wight decimal places: %.8f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);
    
    }    
}
