package org.example;

public class BinaryMatrix {
    public static void main(String[] args) {
        int [][] mat = {{1,0,0},{0,0,1},{1,0,0}};
        // rows are i
        // coloums are j
//        [1,0,0]
//        [0,0,1]
//        [1,0,0]

    }

    public static boolean checkRows(int [][] mat){
        for(int row = 0; row < mat.length; row++) {
            for (int column = 0; column < mat.length; column++) {
                if (mat[row][column] == 1) {
                    checkRestRow(mat, row, column);
                }
            }
        }
        return true;
    }
    public static boolean checkRestRow(int [][] mat, int row, int column){
        return true;
    }
}
