package review5;

import java.sql.Array;

public class TwoDArrayReview {
    public static void main(String[] args) {

        int [][] array= {
                {1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {31, 32, 33, 22, 25}
        };

        for (int row=0; row<array.length; row++){
            for (int col=0; col<array[row].length; col++){

                if (row%2!=0){
                System.out.print(array[row][col]+" ");
                }


            }
            System.out.println();
        }























        int numberOfArrays=array.length;
        System.out.println(numberOfArrays);

        int numberOfElementIn1Array=array[0].length;
        System.out.println(numberOfElementIn1Array);

        int numberOfElementsIn4Arrays=array[3].length;
        System.out.println(numberOfElementsIn4Arrays);
    }
}
