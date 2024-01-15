package src.Exception;

public class Excep8 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.exit(0);
        }
        catch(Exception e){
            System.out.println("This is catch block");
        }
        finally {
            System.out.println("This is finally block ");
        }
    }
}
