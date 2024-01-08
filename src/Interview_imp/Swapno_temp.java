package src.Interview_imp;

public class Swapno_temp {
    public static void main(String[]args){
        int a=10;
        int b=20;
       // int temp=a;

        //a=b;
       // b=temp;
        a = a * b; // 200
        b = a / b;//10; 200/20
        a = a / b;//200/10=20
        System.out.println("The value of a :" +a);
        System.out.println("The value of b :" +b);
    }
}
