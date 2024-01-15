package src.Exception;

public class Excep4 {
    public static void main(String[] args) {
        String s= "Shubhangi";
        System.out.println("1");
        System.out.println("2");
        try{
            System.out.println("Try start");
            System.out.println(s.length());
            System.out.println(10/0);
            System.out.println("Try end");
        }
        catch (ArithmeticException e){
            System.out.println("This is arithmetic Exception catch block");
        }
        catch(NullPointerException e){
            System.out.println("This is null pointer exception catch block");
        }
        System.out.println("4");
        System.out.println("5");
    }
}
