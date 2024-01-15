package src.OOPS_7thDec;

public class Prog05 {

    public Prog05(int a,int b,int c){
        System.out.println("This is int parameter constructor");

    }
    public Prog05(int s, String k){
        System.out.println("This is int and string parameter constructor");
    }

    public static void main(String[] args) {
        Prog05 p= new Prog05(1,4,5);
        Prog05 p1= new Prog05(4,"Ganesh");
    }
}
