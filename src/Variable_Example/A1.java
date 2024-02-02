package src.Variable_Example;

public class A1 {
    static {
        System.out.println("This is static block");
    }
    public A1(){
        System.out.println("This is constructor");
    }
    {
        System.out.println("This is instance block");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        A1 a=new A1();

    }
}
