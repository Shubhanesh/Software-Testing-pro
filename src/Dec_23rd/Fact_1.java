package src.Dec_23rd;

import java.util.Scanner;

public class Fact_1 {
    public static void main(String[] args) {
        // Factorial Program
//        1! -> 1
//        2! -> 2*1
//        3! -> 3*2*1
//        5! -> 5*4*3*2*1 = 120
        //user_input = 5
        //print -> 120

        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();

        long fact = 1;
        // 5  -> i = 1 to 5 ->  fact = fact * i , i++
        // A -> int i = 1;  initialized
        // B -> i <=number or i < =5 condition
        // C -> i++  ;increment parameter
        // D -> fact = fact*i; printing message

       for (int i=1;i<= number ;i++) {
            fact=fact*i ;

        }
        System.out.println("fact number ->" +fact);
        sc.close();

       // int i=1;
      // while(i<=number){
       //    fact = fact*i;
       //     i++;
      // }
      //  System.out.println("Fact -> "+ fact);


    }
}
