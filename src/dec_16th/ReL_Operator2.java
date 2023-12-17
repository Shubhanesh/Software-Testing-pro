package src.dec_16th;

public class ReL_Operator2 {
    public static void main(String[] args) {
        // Interview Question - Relational Operator
        //System.out.println(10==10);
        //System.out.println(10>10);
        //System.out.println(10<10);
       // System.out.println(10<=10);
       // System.out.println(10>=10);

        //System.out.println('A'=65);
        System.out.println('A'==65);//ASCII
        System.out.println('A');
        byte b=65;
        System.out.println('A'==b);
        System.out.println('A'==65.0);// ? ( This is property of java)
        System.out.println('A'==65.0F);
        System.out.println('A'==65.02);//false because of its now totally decimal number

        //System.out.println(true==0);//== operator can't be applied to boolean or int
        System.out.println(true==true);
        //System.out.println(true>=true);
    }
}
