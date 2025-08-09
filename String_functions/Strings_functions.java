package String_functions;

public class Strings_functions {
    public static void main(String[] args) {
        
        String orginal = "abc EDF gh IJK ab ";

        System.out.println("Original -" + orginal);
        System.out.println("Upper -" + orginal.toUpperCase());
        System.out.println("Lower -" + orginal.toLowerCase());
        System.out.println("Trim -" + orginal.trim());
        System.out.println("Substring (2) - " + orginal.substring(2));
        System.out.println("Substring (2,9) - " + orginal.substring(2, 9));
        System.out.println("Replace - " + orginal.replace('g', 'z'));
        int i = orginal.indexOf("ab");
        int j = orginal.lastIndexOf("ab");
        System.out.println("First index ab - " + i);
        System.out.println("Last index ab - " + j);
        
        String s = "potato apple lemon";
        String[] v = s.split(" ");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
    }   
}
