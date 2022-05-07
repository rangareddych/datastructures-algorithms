package com.array.examples;

import java.util.Arrays;

public class PairNumbersEqualToSum {

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
        printPair(numbers, 7);
        printPair(numbersWithDuplicates, 7);
    }

    private static void printPair(int[] numbers, int sum){
        System.out.println("Given numbers array : "+ Arrays.toString(numbers));
        System.out.println("Given sum : "+sum);
        for(int i=0; i<numbers.length; i++){
            int firstNumber = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                int secondNumber = numbers[j];
                if(sum == firstNumber + secondNumber){
                    System.out.println("Pair of number equal to sum : "+firstNumber+" , "+secondNumber);
                }
            }
        }
    }
}
