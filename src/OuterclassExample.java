package src;

public class OuterclassExample {
    private int a=30;
    class Inner {
        void message() {
            System.out.println(a);
        }
    }

        public static void main(String[] args) {
            OuterclassExample o=new OuterclassExample();
            OuterclassExample.Inner in = o.new Inner();
            in.message();
        }
    }

