package com.array.examples;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1}};

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
        }
    }

    private static int[] removeDuplicates(int[] numbers){
        System.out.printf("Duplicates : ");
        int lenth = numbers.length;
        int[] result = new int[lenth];
        Arrays.sort(numbers);
        int previous = numbers[0];
        result[0] = previous;

        for(int i=1; i<numbers.length; i++){
            if(previous != numbers[i]){
                result[i] = numbers[i];
                previous = numbers[i];
            }else {
                System.out.print(numbers[i] +" , ");
            }
        }
        System.out.println();
        return result;
    }
}
