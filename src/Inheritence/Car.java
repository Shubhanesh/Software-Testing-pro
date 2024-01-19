package src.Inheritence;

public class Car extends Vechile{
    @Override
    public void drive() {
        System.out.println("Reparing car");
    }

    public static void main(String[] args) {
        Vechile v=new Vechile();
        v.drive();

       Car c1=new Car();
        c1.drive();
    }
}
