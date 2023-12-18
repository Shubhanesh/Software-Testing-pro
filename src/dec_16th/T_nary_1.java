package src.dec_16th;

public class T_nary_1 {
    public static void main(String[] args) {
        // Ternary operator.

        //int a =  condition ?  if this is true print do this :  If false do this

        int a=20;
        int b=10;
        int c=15;

        // -> ?
        // a > b && a> c -> a

        // (a>c) ? a : c
        // ((b>c) ? b : c)

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);


    }
}
