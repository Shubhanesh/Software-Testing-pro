package src.Exception;

public class Excep9 {
    public static void main(String[] args) {
        try{
            System.out.println(10/2);
        }
        catch(Exception e){
            System.out.println("This is catch block");
            System.exit(0);
            System.out.println();
        }
        finally
        {
            System.out.println("Finally block always executed");
        }
    }
}
