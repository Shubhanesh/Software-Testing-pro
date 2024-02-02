package src.Variable_Example;

public class Variableexample1 {
    int a=10; // instance variable
    static int s=12;
    static int varia;


    public static void show() {
        int b = 20;
        System.out.println("local variable: " + b);
       // System.out.println("instance variable:" + a); // instance variable can't access inside the static variable
        System.out.println(s);
        System.out.println(varia);

    }

    public static void main(String[] args) {
        varia=42; // assign value to the static variable

        Variableexample1.show();

    }
}
