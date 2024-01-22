package src.Abstraction.Abstract;

public class SavingAccount extends BankAccount{

    @Override
    public void deposit() {
        System.out.println("This is deposit method of SA class");
    }

    @Override
    public void withdrwal() {
        System.out.println("This is withdrwal method of SA class");

    }
}
