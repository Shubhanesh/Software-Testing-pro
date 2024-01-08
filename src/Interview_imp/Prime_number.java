package src.Interview_imp;

import java.util.Scanner;

public class Prime_number {

    public static void main(String[] args) {

        // User input= 1to 50
        // logic Prime no ->  number%1 ,number >1 ,0 & 1= not prime number
        //System.out.println(10);
        int i = 0;
        int flag = 0;
        int m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("Not a prime -> " + n);
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("Not a prime number");
                    flag = 1;
                    break;
                }
            }
        }

        if(flag ==0 ){
            System.out.println("Prime Number" + n);
        }
    }
}
