package src.OOPS_7thDec;

public class Prog04 {
    public Prog04(int a){
        System.out.println("This is int parameter constructor");

    }
    public Prog04(String s){
        System.out.println("This is string parameter constructor");
    }

    public static void main(String[] args) {
        Prog04 p=new Prog04(1);
        Prog04 p1=new Prog04("Shubha");
    }

}
