package src.Exception;

public class Excep3 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        try{
            System.out.println("Try start");
            System.out.println(10/0);
            System.out.println("Try end"); // Compiler once go to the catch blk never retruns into the try blk
        }
        catch (Exception e){
            System.out.println("We cant devide any no by zero");
        }
        System.out.println("4");
        System.out.println("5");
    }
}
