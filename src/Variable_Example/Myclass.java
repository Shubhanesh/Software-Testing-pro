package src.Variable_Example;

public class Myclass {
    // Static variable
    static int staticVariable;

    public static void staticMethod() {
        // Access the static variable directly within the static method
        System.out.println(staticVariable);
    }
    public void show(){
        System.out.println("nonstatic variable");
        System.out.println(staticVariable);   // static variable can access through non static method
    }

    public static void main(String[] args) {
        // Set a value for the static variable
        staticVariable = 42;

        // Call the static method
        staticMethod();
        Myclass m=new Myclass();
        m.show();
    }
}