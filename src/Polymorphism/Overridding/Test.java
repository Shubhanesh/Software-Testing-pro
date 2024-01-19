package src.Polymorphism.Overridding;
// method overriding: Method name and parameter must be same
// overriding achived by parent child relationship
// we can't override main , final, private and static method
public class Test {
    public static void main(String[] args) {
        Parent p=new Parent(); // parent class object
        p.marry();

        Child c=new Child(); // Child class object
        c.marry();

        Parent p1=new Child(); //
        p1.marry();

    }
}
