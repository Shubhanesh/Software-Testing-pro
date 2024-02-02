package src.Exception;

public class TestThrow {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("The person is not eligible for vote");
        }
        else {
            System.out.println("The person is eligible for vote");
        }
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("");
    }
}
