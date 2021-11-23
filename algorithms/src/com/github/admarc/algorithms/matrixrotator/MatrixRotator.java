package com.github.admarc.algorithms.matrixrotator;

import java.util.Arrays;

public class MatrixRotator {
    
    int[][] matrix;
    
    public MatrixRotator(int[][] m) {
        matrix = m;
    }
    
    public void rotate(int degrees){
        int[] allowedDegrees = new int[]{90, 180, 270};
        if(Arrays.binarySearch(allowedDegrees, degrees) < 0) {
            throw new IllegalArgumentException("The only possible values for degress are: " +
                    Arrays.toString(allowedDegrees)
            );
        }

        for(int i=0; i<degrees/90; i++){
            rotateOnce();
        }
    }

    private void rotateOnce()
    {
        int[][] tempMatrix = arrayDeepCopy(matrix);

        int newCol = tempMatrix.length - 1;

        for (int row=0; row < tempMatrix.length; row++) {
            int newRow = 0;
            for (int col=0; col < tempMatrix[row].length; col++) {
                matrix[newRow][newCol] = tempMatrix[row][col];
                newRow++;
            }
            --newCol;
        }
    }
    
    private int[][] arrayDeepCopy(int[][] originalArray) {
    
        final int[][] result = new int[originalArray.length][];
        for (int i = 0; i < originalArray.length; i++) {
            result[i] = Arrays.copyOf(originalArray[i], originalArray[i].length);
        }
        return result;
    }
}
