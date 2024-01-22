package src.Dec_20th_Collection;

import java.util.List;
import java.util.ArrayList;

public class Prog02 {
    public static void main(String[] args) {
        List l1=new ArrayList();
        l1.add("Java");
        l1.add("Shubhangi");
        l1.add(true);
        l1.add(123);

        System.out.println(l1);
        l1.set(0,"Python");
        System.out.println(l1);
        l1.remove("Python");
        System.out.println(l1);


        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        for(Object o :l1) {
            System.out.println(o);
        }
    }
}
