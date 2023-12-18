package src.dec_16th;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a= sc.nextInt();

        if(a%2==0) {
            System.out.println("The number is even");
        }
            else{
                System.out.println("The number is odd");
            }
        }

    }

