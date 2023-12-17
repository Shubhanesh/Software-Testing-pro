package src.dec_16th;

public class Comp_Operator {
    public static void main(String[] args) {
        // Compound Assignment Operators
        // +=, -=, /= ,*= , %=
        int a=10;
        int b=45;
        b += 30; // b = b + 30
        System.out.println(b);
        int b1=90;
        b1 -=10;// b1=b1-10
        System.out.println(b1);

        int a1=5;
        a1 *= 10; // a1=a1*10
        System.out.println(a1);

        int a2=10;
        a2 %= 2; // a2=a2%2
        System.out.println(a2);

        int a3=10;
        a3 /= 2; // a3=a3/2
        System.out.println(a3);
    }
}
