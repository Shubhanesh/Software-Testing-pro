package src.Polymorphism.Overloading;
// Method overloading-: achived withing class
// same method name ,parameter must be different
// can overload main method ,also private ,static and final method

public class Mobile {
    public void camera(){
        System.out.println("5MP");
    }
    public void camera(int a){
        System.out.println("10 mp");

    }

    public static void main(String[] args) {
        Mobile m= new Mobile();
        m.camera();
        m.camera(10);
    }
}
