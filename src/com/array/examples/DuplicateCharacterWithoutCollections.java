package com.array.examples;

public class DuplicateCharacterWithoutCollections {

    public static void main(String[] args) {
        printDuplicates("ranga");
        printDuplicates("reddy");
    }

    private static void printDuplicates(String input){
        char[] alphabets = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] counts = new int[alphabets.length];

        String upperCase = input.toUpperCase();
        for(int i=0 ; i<upperCase.length(); i++){
            char ch = upperCase.charAt(i);
            for(int j=0; j<alphabets.length; j++){
                if(ch == alphabets[j])
                    counts[j] = counts[j]+1;
            }
        }

        for(int k=0; k<counts.length; k++){
            if(counts[k] > 1){
                System.out.println(alphabets[k] + " ----> "+counts[k]);
            }
        }
    }
}
