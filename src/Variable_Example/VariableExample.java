package src.Variable_Example;

public class VariableExample {

    int a=20;
    // Instance or Global variable
    // instance variable=it is declare inside the class bit outside the body of method

    static  int s=10;// static variable
    // we can call static variable inside the non-static method

    public void show() {
        int a1 = 22; // Local variable
        // local variable=declare inside the method it can't access outside the method
        System.out.println("This is local variable:" + a1);
        System.out.println("This is instance variable :" +a);
        System.out.println("This is the static variable:" +s);
    }

        public static void main(String []args){
        VariableExample v=new VariableExample();
        v.show();

        }

    }



