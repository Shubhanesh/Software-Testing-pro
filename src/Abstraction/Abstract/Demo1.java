package src.Abstraction.Abstract;

public class Demo1 extends Demo{
    @Override
    public void show() {
        System.out.println("This is the show method of class Demo1 ");
    }

    public static void main(String[] args) {
        Demo1 d=new Demo1();
        d.display();
        d.show();
    }
}

// in abstract class both method are present - abstract and non -abstract