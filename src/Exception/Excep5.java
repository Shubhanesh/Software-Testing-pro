package src.Exception;

public class Excep5 {
    // Finally block - always executed
    // 2 conditions not executed-1)System.exit(0) 2) JVM shutdown
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("This catch block");
        }
        finally {
            System.out.println("Finally block always executed");
        }

    }
}
