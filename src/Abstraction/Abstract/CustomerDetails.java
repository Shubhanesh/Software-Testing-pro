package src.Abstraction.Abstract;

public class CustomerDetails extends Customer{
    @Override
    public void pinNo() {
        System.out.println("1994");
    }

    public static void main(String[] args) {
        CustomerDetails d=new CustomerDetails();
        d.accountdetails();
        d.branchName();
        d.pinNo();
    }
}
