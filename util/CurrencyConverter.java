package util;

public class CurrencyConverter {
    public static double DOLAR_VALUE = 5.45;

    public static double dolarConverter(double value){
        double result = value * DOLAR_VALUE;
        return  result + result * 0.06;
    }

}
