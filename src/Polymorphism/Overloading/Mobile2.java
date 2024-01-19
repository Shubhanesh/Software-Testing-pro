package src.Polymorphism.Overloading;

public class Mobile2 {
    // Return type doesn't matter

    public int camera(String s){
        System.out.println("Samsung");
        return 0;

    }
    public String camera(int a){
        System.out.println("int a=10 mp");
        return null;
    }

    public static void main(String[] args) {
        Mobile2 m2=new Mobile2();
        m2.camera(10);
        m2.camera("Samsung");
    }
}
