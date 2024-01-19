package src.Polymorphism.Overloading;
// we can overload private,static,final method
public class Mobile5 {
    final void show(String s) {
        System.out.println("This is final method");
    }
    private void show(int a){
        System.out.println("This is private method");
    }
    static void show(float f){
        System.out.println("this is static method");
    }

    public static void main(String[] args) {
        Mobile5 m5=new Mobile5();
        m5.show(1);
        m5.show("java");
        Mobile5.show(3.13f); // static method can called by class name

    }

}
