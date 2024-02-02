package src.Variable_Example;

public class Static_blockEx {
    // if you want to execute something before main method can use static block
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
    }

}
