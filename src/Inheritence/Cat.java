package src.Inheritence;

public class Cat extends Animal {
    @Override
    public void makeSound() {

        System.out.println("The cat");
    }


    public static void main(String[] args) {
       // Animal animal = new Animal();
      //  Cat cat = new Cat();
        Animal a=new Cat();
        a.makeSound();

   // animal.makeSound();
        //cat.makeSound();
    }
}