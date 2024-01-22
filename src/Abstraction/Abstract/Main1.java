package src.Abstraction.Abstract;

public class Main1 {
    public static void main(String[] args) {
        SavingAccount sa= new SavingAccount();
        sa.deposit();
        sa.withdrwal();

        CurrentAccount ca=new CurrentAccount();
        ca.deposit();
        ca.withdrwal();

        BankAccount ba=new CurrentAccount();
        ba.deposit();
        ba.withdrwal();

        BankAccount ba1=new SavingAccount();
        ba1.withdrwal();
        ba1.deposit();
    }
}
