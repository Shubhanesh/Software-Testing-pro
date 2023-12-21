package src.dec17th;

import java.util.Scanner;

public class If_else3 {
    public static void main(String[] args) {
        // What If  - Number -> > 20, < 20 , < 10 ->

        // If, else if , else
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        if(a>20){
            System.out.println("a is greater than 20");
        }
        else if (a>10){
            System.out.println("a is greater than 10");
        }
        else{
            System.out.println("a is less than 20");
        }
    }
}
