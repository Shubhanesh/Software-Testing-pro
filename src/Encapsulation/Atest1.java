package src.Encapsulation;

public class Atest1 {
    public static void main(String[] args) {
        Account a=new Account();
        a.setAcc_no(1234623456);
        a.setName("Shubhangi");
        a.setEmail("shubhangi.gholap@gmail.com");
        a.setAmount(23456.56f);
        System.out.println(a.getAcc_no()  +"\n"+a.getAmount()+"\n"+a.getEmail()+"\n"+a.getName() );
       // System.out.println("a.getAcc_no()  \n a.getAmount() \n a.getEmail() \n a.getName() ");
    }

}
