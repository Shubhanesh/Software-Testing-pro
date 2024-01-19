package src.Inheritence;

public class Test1 {
    public static void main(String[] args) {
        //A1is parent class
        //B1 is the child class
      //  case 1
        A1 a= new A1();// object creation
        a.show();

        // case 2
        B1 b=new B1();// object creation
        b.display();
        b.show();  // we can access class A1 method because B1 extends A1 class

       // case 3:

        A1 a1= new B1();
        a1.show();// can called only parent class method if method name is diff and if method name is same preference goes to the child class

        // case 4:
        //B1 b1= new A1(); // this is invalid object creation becoz we are trying to access parent class before it born



    }
}
