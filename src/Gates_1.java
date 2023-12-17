package src;

public class Gates_1 {
    public static void main(String[] args) {
        //OR gate ||
        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);

        // And gate &&
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        int a=12;
        boolean b=!(a>10||a<5);
        System.out.println(b);

        int a1=60;
        boolean b1=!(a<2&&a>8);
        System.out.println(b1);

        int x=90;
        int y=90;
        boolean z=(x>=y);
        System.out.println(z);
    }
}
