package Looping_structs;

import java.util.Scanner;

public class exercise_looping1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int senha = sc.nextInt();
        while (senha != 2002) 
        {
            System.out.println("senha incorreta, tente novamente");
            senha = sc.nextInt();
        }
        System.out.println("senha correta");
        sc.close();
    }
}
