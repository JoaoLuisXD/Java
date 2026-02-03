package Matriz;

import java.util.Scanner;

public class exercise1_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for(int i = 0; i < mat.length; i++) {
           for(int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
           } 
        }

        System.out.print("Enter a number that is pertences in the matriz: ");
        int x = sc.nextInt();
        Position(mat, x);

        sc.close();
    }

    public static void Position(int[][] mat, int x){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position: " + i + "," + j);
                    if(i-1 >= 0){
                        System.out.println("up: " + mat[i-1][j]);
                    }
                    if (i+1 < mat.length) {
                        System.out.println("down: " + mat[i+1][j]);
                    }
                    if (j-1 >= 0) {
                        System.out.println("left: " + mat[i][j-1]);
                    }
                    if (j+1 < mat[i].length) {
                        System.out.println("right: " + mat[i][j+1]);
                    }
                }
            }
        }
    }
}
