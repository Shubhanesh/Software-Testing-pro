package src.Polymorphism.Overloading;

public class Mobile4 {
    public static void main(Object args){
        System.out.println("object");
    }

    public static void main(int args) {
        System.out.println("int");

    }

    public static void main(String[] args) {
        System.out.println("String"); // std main method
        Mobile4 m4=new Mobile4();
       // Mobile4.main("s"); /// object argument
        m4.main(12);//int argument
    }
}
