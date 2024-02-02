package src.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow1 {
    public static void method() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\Shubhangi\\Documents\\Shubhangi_docs");
        throw new FileNotFoundException();
        //"C:\\Users\\Anurati\\Desktop\\abc.txt"

    }

    public static void main(String[] args) {
        try
        {
            method();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("");
    }
}
