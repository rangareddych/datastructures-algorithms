package com.array.examples;

import java.util.Arrays;

public class MatrixOperations {

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2},{3,4}};
        int[][] b = new int[][]{{1,2},{3,4}};
        printMatrix(addTwoMatrices(a, b));
        printMatrix(substractTwoMatrices(a, b));
        printMatrix(multiplyTwoMatrices(a, b));
    }

    private static int[][] addTwoMatrices(int[][] a, int[][] b){
        System.out.printf("ADDITION : ");
        int rows = a.length;
        int columns = a[0].length;

        int[][] result = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    private static int[][] substractTwoMatrices(int[][] a, int[][] b){
        System.out.printf("SUBSTRACTION : ");
        int rows = a.length;
        int columns = a[0].length;

        int[][] result = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        return result;
    }

    private static int[][] multiplyTwoMatrices(int[][] a, int[][] b){
        System.out.printf("MULTIPLICATION : ");
        int rows = a.length;
        int columns = b[0].length;

        int[][] result = new int[rows][columns];

        if(rows == b[0].length){
            int sum=0;
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    for(int k=0; k<b.length; k++){
                        sum = sum + a[i][k] * b[k][j];
                    }
                    result[i][j] = sum;
                    sum = 0;
                }
            }
        }

        return result;
    }

    private static void printMatrix(int[][] a){
        for(int i=0; i<a.length; i++){
            System.out.println();
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j] + "  ");
            }
        }
        System.out.println();
    }
}
