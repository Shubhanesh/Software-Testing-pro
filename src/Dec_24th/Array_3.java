package src.Dec_24th;

public class Array_3 {
    public static void main(String[] args) {
         int [] arry_1 ={1,2,3,4};
         int[] arry_2  = {1,2,3,4};

        System.out.println(arry_1==arry_2);

       // int [] arry_3= new int [4];
        int [] arry_3=arry_1;

        System.out.println(arry_3==arry_1);

        arry_3[0]=20;
        System.out.println(arry_3[0]);
        System.out.println(arry_1[0 ]);
    }
}
