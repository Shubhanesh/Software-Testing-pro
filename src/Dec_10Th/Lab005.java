package src.Dec_10Th;

public class Lab005 {
    public static void main(String[] args) {
        /**
         *Program - Showcase difference between println vs print
         * **/
        int age = 34;
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float
        System.out.println("Your Age is:"+age);
        System.out.printf("Your Age is %d",age);
        System.out.print(age);
    }
}
