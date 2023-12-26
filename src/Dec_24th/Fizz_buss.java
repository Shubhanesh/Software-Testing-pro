package src.Dec_24th;

public class Fizz_buss {
    public static void main(String[] args) {
        // FizzBuzz Problem:
        // Write a program that prints numbers from 1 to 100.
        // For multiples of 3, print "Fizz" instead of the number,
        // and for the multiples of 5, print "Buzz".
        // For numbers which are multiples of both 3 and 5,
        // print "FizzBuzz".

        // Coding ->
        // 1. user input - ?
        // 2. Rough logic -> for 1 to 100 , i%3==0 -> Fizz , i%5 ==0 -> Buzz , i%3 == 0 && i%5 ==0 -> Fizzbuzz
        // 3. Brute force
        // 4. Logic correction

        for(int i=1; i<=100;i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("End of the program");


    }
}
