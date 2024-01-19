package src.Polymorphism.Overloading;
// We can overload main method
public class Mobile3 {
    public static void main(Object[]args){
        System.out.println("object");
    }
    public static void main(String[]args){
        System.out.println("String");
        Mobile3.main(args);
       // Mobile3.main(args);
    }
}
