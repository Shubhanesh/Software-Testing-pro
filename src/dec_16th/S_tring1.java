package src.dec_16th;

public class S_tring1 {
    public static void main(String[] args) {
        String s="I am working as QA engineer";//scp-string constant pool
        String s2="I am working as QA engineer";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String s1=new String("I am working as QA engineer"); //OAor heap area

       // System.out.println(s==s2);
        //System.out.println(s==s1);
       // System.out.println(s.equals(s2));
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s1));


    }
}
