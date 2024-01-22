package src.Abstraction.Abstract;

public class CurrentAccount extends BankAccount {

    @Override
    public void deposit() {
        System.out.println("Deposit method of CA");
    }

    @Override
    public void withdrwal() {
        System.out.println("Withdrwal method of CA");

    }
}
