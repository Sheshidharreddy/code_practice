package org.codePractices;

public class TransposeMatrix {
    public static void main(String[] args){

        int[][] matrix = {
                {1,2,3},
                {2,3,5},
                {6,7,8}
        };
        TransposeMatrix obj = new TransposeMatrix();
        int[][] result = obj.transpose(matrix);


// Print transposed matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] transpose(int[] [] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] [] T = new int[cols][rows];
        for(int i = 0 ; i < rows; i++ ){
            for (int j = 0; j < cols; j++){
                T[j][i]= matrix[i][j];
            }
        }
        return T;
    }
}
