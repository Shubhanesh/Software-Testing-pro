package src.OOPS_7thDec;

public class Prog03 {
    // Parameter constructor
    public Prog03(){
        System.out.println("This is default constructor");
    }
    public Prog03(int a){
        System.out.println("This parameter constructor :" +a);
    }

    public static void main(String[] args) {
        Prog03 p=new Prog03();
        Prog03 p1=new Prog03(123);
        System.out.println("This is main method");
    }

}
