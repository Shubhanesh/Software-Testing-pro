package src.Variable_Example;

public class Instance_BLK {

    public Instance_BLK(){
        System.out.println("This is default constructor");
    }
    {
        System.out.println("This is instance block");
    }

    public static void main(String[] args) {
        System.out.println("this is main method");
        Instance_BLK b=new Instance_BLK();

    }
}
