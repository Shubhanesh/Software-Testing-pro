package src.Dec_24th;

import java.util.Scanner;

public class Array_7 {
    public static void main(String[] args) {
        // Take input user Marks of 5 subjects and Print the marks
        Scanner sc= new Scanner(System.in);
        float []marks= new float[5];
        System.out.println("Enter the marks of first subject");
        marks[0]= sc.nextFloat();
        System.out.println("Enter the marks of 2nd subject");
        marks[1]= sc.nextFloat();
        System.out.println("Enter the marks of 3rd subject");
        marks[2]= sc.nextFloat();
        System.out.println("Enter the marks of 4th subject");
        marks[3]= sc.nextFloat();
        System.out.println("Enter the marks of 5th subject");
        marks[4]= sc.nextFloat();

        for(int i=0;i<marks.length;i++){
            if(marks[i]<30){
                System.out.println("You are in failed in this subject");

            }
            System.out.println(marks[i]);
        }
        sc.close();

    }
}
