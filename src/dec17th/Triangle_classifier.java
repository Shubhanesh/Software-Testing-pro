package src.dec17th;

import java.util.Scanner;

public class Triangle_classifier {
    public static void main(String[] args) {
        //   Write a program that classifies a triangle based on its side lengths.
        //   Given three input values representing the lengths of the sides, determine

        //   if the triangle is equilateral (all sides are equal),
        //   isosceles (exactly two sides are equal), or
        //   scalene (no sides are equal).
        //   Use an if-else statement to classify the triangle.


        //  side 1, side 2, side 3 ->  side1 == side 2 == side 3 ->  equilatera
        // (side1 == side 2) or side 2 == side 3 -> isosceles
        // scalene

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of side 1,side 2,side3,I will tell the triangle type");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();

        if((a==b)&&(b==c)&&(a==c)){
            System.out.println("The triangle is equilateral");
        }
        else if((a==b )|| (b==c)||(a==c)){
            System.out.println("The triangle is isosceles");
        }
        else {
            System.out.println("The triangle is scalene ");
        }

    }
}
