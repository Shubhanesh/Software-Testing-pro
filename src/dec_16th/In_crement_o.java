package src.dec_16th;

public class In_crement_o {
    public static void main(String[] args) {
        // Increment operator.
        // Pre and Post
        int a=10;
       // a=a+1;
       // a+=1
        a++; // Post Increment - a = a+1; first print then increment so value of a is 11
        ++a; // Pre Increment  = a = a+1;first increment then print so value of a is 12
        System.out.println(a);
    }
}
