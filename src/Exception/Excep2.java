package src.Exception;

public class Excep2 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");

        // try block contain risky code
        try {
            System.out.println(10 / 0);
        }
        // Handling the code if error occur in try block compiler goes to catch block never go back again in try block
      catch (Exception e){
          System.out.println("We can't devide any no by zero");
      }
        System.out.println("4");
        System.out.println("5");
    }
}
