package src.dec_16th;

public class Ter_nary {
    public static void main(String[] args) {
        // Ternary operator.
        //int a =  condition ?  if this is true print do this :  If false do this
        int a= true ? 10:20;
        int a1=(30>40) ? 10:20;
        System.out.println(a1);
        System.out.println(a);
        String str= 10>20 ? "10":"Twenty";
        System.out.println(str);

        int x=10;
        int y=20;

        int max= x<y ? y:x;
        int min= x<y ? x:y;
        System.out.println(max);
        System.out.println(min);
    }
}
