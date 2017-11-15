/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.admarc.algorithms.matrixrotator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixRotatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void itShouldThrowExceptionForInvalidDegreesNumber() {
        int[][] matrix = { {1,2}, {3,4} };
         
        MatrixRotator rotator = new MatrixRotator(matrix);
        rotator.rotate(999);
    }
     
     @Test
     public void itShouldRotate4x4MatrixBy90degrees() {
         // 1 2  3   4
         // 5 6  7   8
         // 9 10 11 12
         //13 14 15 16
         int[][] matrix = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
         
         MatrixRotator rotator = new MatrixRotator(matrix);
         rotator.rotate(90);
         
         // 13 9  5 1
         // 14 10 6 2
         // 15 11 7 3
         // 16 12 8 4
         assertArrayEquals(matrix, new int[][]{ {13,9,5,1}, {14,10,6,2}, {15,11,7,3}, {16,12,8,4} });
     }

     @Test
     public void itShouldRotate4x4MatrixBy180degrees() {
         // 1 2  3   4
         // 5 6  7   8
         // 9 10 11 12
         //13 14 15 16
         int[][] matrix = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };

         MatrixRotator rotator = new MatrixRotator(matrix);
         rotator.rotate(180);

         // 16 15 14 13
         // 12 11 10 9
         // 8  7  6  5
         // 4  3  2  1
         assertArrayEquals(matrix, new int[][]{ {16,15,14,13}, {12,11,10,9}, {8,7,6,5}, {4,3,2,1} });
     }

     @Test
     public void itShouldRotate4x4MatrixBy270degrees() {
         // 1 2  3   4
         // 5 6  7   8
         // 9 10 11 12
         //13 14 15 16
         int[][] matrix = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };

         MatrixRotator rotator = new MatrixRotator(matrix);
         rotator.rotate(270);

         // 4  8  12 16
         // 3  7  11 15
         // 2  6  10 14
         // 1  5  9  13
         assertArrayEquals(matrix, new int[][]{ {4,8,12,16}, {3,7,11,15}, {2,6,10,14}, {1,5,9,13} });
     }
}
