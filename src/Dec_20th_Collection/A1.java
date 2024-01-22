package src.Dec_20th_Collection;
// homogeneous and heterogeneous elements are allowed
import java.util.ArrayList;

public class A1 {
    public static void main(String[] args) {
        int a=30;
        boolean b=true;
        float f=3767.67f;
        ArrayList a1 = new ArrayList<>();
        // Hetrogeneous
        a1.add(4);
        a1.add("Shubhangi");
        a1.add(3.1234f);
        a1.add(b);
        System.out.println("Hetrogeneous==" +a1);
        // Homogeneous
        ArrayList a2=new ArrayList();
        a2.add("Shubhangi");
        a2.add("Ganesh");
        a2.add("Aher");
        System.out.println("Homogeneous=="+a2);
        System.out.println(a2.contains("Raj")); //false
        System.out.println(a2.contains("Shubhangi"));
        System.out.println(a2.remove(1));
        System.out.println(a2);
        System.out.println(a2.isEmpty());

    }
}
