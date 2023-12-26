package src.Dec_24th;

public class Array_6 {
    public static void main(String[] args) {
        int []arr1= {1,3,5,7,9};
        long[]arr_l={8l,16l,15l};
        float[]arr_f={12.44f,10.00f};
        double[]arr_d= {12.3,12.34,10.01};
        boolean[]arr_b= {true,false,true,false};
        char[] arr_c={'a','b','d'};
        String[]arr_s={"Shubha","Seema","Reena"};

        System.out.println(arr1.length);
        System.out.println(arr_s.length);
        for(int i=0;i<arr_s.length;i++){
            System.out.println(arr_s[i]);
        }
    }
}
