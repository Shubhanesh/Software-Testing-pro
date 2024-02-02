package src.GenricsExample;

import java.util.ArrayList;
import java.util.Iterator;
// without Generics we can print diff type of data
public class A {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add("Shubhangi");
        al.add(12);
        al.add("Ram");
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
