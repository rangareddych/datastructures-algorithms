package com.string.examples;

public class StringRotationCheck {
    public static void main(String[] args) {
        System.out.println(rotationCheck("abc", "bca"));
        System.out.println(rotationCheck("abc", "bac"));
    }

    private static boolean rotationCheck(String original, String input){
        if(original.length() != input.length()){
            return false;
        }

        String concatenated = original + original;
        if(concatenated.indexOf(input) != -1){
            return true;
        }
        return false;
    }
}
