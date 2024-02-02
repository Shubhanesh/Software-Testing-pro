package src.GenricsExample;

import java.util.ArrayList;
import java.util.Iterator;

public class A1 {
    public static void main(String[] args) {
        ArrayList <String> al= new ArrayList<String>();
        al.add("Shubhangi");
        al.add("Ram");
        al.add("Ganu");
       // al.add(123);  // it will give compile time error due to diff data type
        Iterator itr= al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
