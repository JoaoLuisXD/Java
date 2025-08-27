package application;

import java.util.Scanner;

import entities.Rectangle;

public class RectangleExercise {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of the rectangle: ");
        rec.height = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        rec.width = sc.nextDouble();

        System.out.println("Area: " + rec.area());
        System.out.println("Perimeter: " + rec.perimeter());
        System.out.println("Diagonal: " + rec.diagonal());


        sc.close();
    }
}
