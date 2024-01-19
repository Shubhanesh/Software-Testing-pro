package src.Polymorphism.Overridding;

public class Test1 {
    public static void main(String[] args) {
        Parent1 p1=new Parent1();
        p1.show();

        Child1 ch1= new Child1();
        ch1.show();

        Parent1 p2=new Child1();
        p2.show();
    }
}
