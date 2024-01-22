package src.Dec_20th_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prog03 {
    public static void main(String[] args) {
        List <String> mylist= new ArrayList<>();
        mylist.add("Shubhangi");
        mylist.add("Ganesh");
        mylist.add("Aher");
        System.out.println(mylist );

        for(int i=0;i< mylist.size();i++){
            System.out.println(mylist.get(i));
        }
        for(String o : mylist){
            System.out.println(o);
        }

        // iterator
        Iterator iterator=mylist.iterator();

            while(iterator.hasNext()){
                System.out.println(iterator.next());

            }
            System.out.println();
        }

        }



