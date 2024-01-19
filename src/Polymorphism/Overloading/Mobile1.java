package src.Polymorphism.Overloading;

public class Mobile1 {
    public void camera(String s){
        System.out.println("String 5MP");
    }
    public void camera(int a, int b){
        System.out.println("10,20,samsung");
    }

    public static void main(String[] args) {
        Mobile1 m1=new Mobile1();
        m1.camera("S");
        m1.camera(10,20);
    }
}
