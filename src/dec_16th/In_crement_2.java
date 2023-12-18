package src.dec_16th;

public class In_crement_2 {
    public static void main(String[] args) {
        int a=10;
        //System.out.println(++a + a++ + a++);
       // System.out.println(a);

      //  ++a= 11 value of a=11
      //  a++= 11 value of a=12
      //    a++=12 value of a=13

        // Part - A ( Exp = 11, a = 11  ) -> ++a -> O/P -> 11
        // Part - B ( Exp = 11, a = 12  ) -> a++ -> O/P -> 11
        // Part - C ( Exp = 12, a = 13  ) -> a++ -> O/P -> 12
        // A+B+C -> 11+11+12 -> 34, a -> 13

        //////////////////2nd example
        //int b=12;
        //System.out.println(++b + b++);
        //System.out.println(b);

       // ++b=13 value of b=13
       // b++ = 13 value of b=14

        //////////////3rd example-decrement operator

        int b1=14;
        System.out.println(--b1 + b1--);
        System.out.println(b1);

        // --b1=13 value of b1 =13
        // b1--=13 value of b1=12

        //////////////4th example
        int b2=10;
        System.out.println(--b2 + ++b2 + b2++);
        System.out.println(b2);

        // --b2=9 value of b2=9
        // ++b= 10 value od b2=10
        // b2++=10 value of b2=11


    }
}
