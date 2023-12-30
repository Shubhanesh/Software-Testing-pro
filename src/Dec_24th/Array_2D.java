package src.Dec_24th;

public class Array_2D {
    public static void main(String[] args) {
        //2D
        int [][]arr=new int[3][3];

        // row 0 to 2
        arr[0][0] = 12;
        arr[0][1] = 34;
        arr[0][2] = 34;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }




    }
}
