package src.Dec_23rd;

import java.util.Scanner;

public class I_math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // sc.next() //string
      //  sc.nextInt() //int
       // sc.nextFloat()// float
      //  sc.hasNextDouble()// double
        //sc.nextBoolean()

        System.out.println("Enter the value of x");
        double x= sc.nextDouble();
        System.out.println("Enter the value of y");
        double y=sc.nextDouble();
        System.out.println("Enter the value of z");
        double z= sc.nextDouble();

        double result;

        //  3/ x^2 + y^2 - |z|
        //  A+B-C ->  A ->  x^2 , B -> Y ^2 , C ->  |Z| abs(Z)  -1 ->  1, -199.98 -> +199.98

        result  = Math.cbrt(Math.pow(x,2) + Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

        // Scanner steam should be closed after we are done.
        // JVM will do it, Garbage Collector -> Who wil do it for you
        // It is not a good practice ->
        sc.close();


    }
}
