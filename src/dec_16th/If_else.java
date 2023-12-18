package src.dec_16th;

import java.util.Scanner;

//        if (condition){
//
//        }else{
//
//        }

public class If_else {
    public static void main(String[] args) {
        // Take three input from user and give max out of two number
        // a,b  a>b -> a, else b

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value od a,b");
        int a= sc.nextInt();
        int b=sc.nextInt();

        if (a>b)
        {
            System.out.println("Max number is" +a);
        }
        else
        {
            System.out.println("Max is " + b);//concatenation - combine two or more things
        }

    }
}
