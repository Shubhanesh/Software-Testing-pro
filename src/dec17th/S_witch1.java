package src.dec17th;

import java.util.Scanner;

public class S_witch1 {
    public static void main(String[] args) {
        // If, Switch -  Condition Based
        // Loops -> Which will repeat something - for, while, do while

        // Switch - Condition based - Multiple Condition'
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day number 1-7 I will tell which day it is");
        int daynumber= sc.nextInt();

        switch(daynumber ){
            case 1:
                System.out.println("The day is Monday");
                break;

            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is thrusday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is saturday");
                break;
            case 7:
                System.out.println("The day is sunday");
                break;
            default:
                System.out.println("showing error");

        }
        System.out.println("--End of the program--");

    }
}
