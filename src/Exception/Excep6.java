package src.Exception;

public class Excep6 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("");
        }
        finally {
            System.out.println("Finally block always executed");
        }
        System.out.println("End of the program ");
        //System.out.println(10/0);
    }
}
