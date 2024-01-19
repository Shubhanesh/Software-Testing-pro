package src.Abstraction.Interface;


public class B implements A1 {
    public void add(){
        System.out.println("This is add method");
    }

    public static void main(String[] args) {
        B b=new B();
        b.add();
    }
}
