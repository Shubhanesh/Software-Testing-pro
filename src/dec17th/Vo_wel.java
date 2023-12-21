package src.dec17th;

import javax.swing.*;
import java.util.Scanner;

public class Vo_wel {
    //aeiou
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character ,i will tell it is vowel or not");
        char user_input= sc.next().toCharArray()[0];
        System.out.println(user_input);

        switch(user_input){

            case'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel :" +'o');
                break;
            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("i don't know which letter it is");
        }
        System.out.println("End of the program");
    }
}
