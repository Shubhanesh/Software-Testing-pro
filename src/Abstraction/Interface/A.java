package src.Abstraction.Interface;

public interface A {

    // Interface is keyword
    // all method by default public and abstract
    // all variables by default public ,static and final
    // Can't create interface object
    // Can't write static and instance block
    // Constructor are not present
    public void add(); // This is abstract method
    // Abstract method:- a method without body (No implementation)
    public abstract void div();
    void sub();
    abstract  void mul();
}
