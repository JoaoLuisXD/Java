package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ConverterExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dolarValue = CurrencyConverter.DOLAR_VALUE;
        System.out.print("What is the dolar price? " + dolarValue);
        System.out.println();

        System.out.print("How many dolars will be bought? ");
        double numDolar = sc.nextDouble();

        double converter = CurrencyConverter.dolarConverter(numDolar);
        System.out.print("Amount to be paid in reais: " + converter);


        sc.close();
    }
}
