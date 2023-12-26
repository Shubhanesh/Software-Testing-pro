package src.Dec_24th;

public class Array_2 {
    public static void main(String[] args) {
        int[]a=  new int[4 ];
        // a -> [0,0,0,0] - default value of int -> 0
        System.out.println(a.length);
        System.out.println(a[0]);
        a[1]=90;
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
       // System.out.println(a[4]);// // Exception in thread "main" // java.lang.ArrayIndexOutOfBoundsException

        a[0]=89;
        System.out.println(a[0]);

        a[2]=98;

        final int []b=new int [4];
        b[0]=90;
        System.out.println(b[0]);





    }
}
