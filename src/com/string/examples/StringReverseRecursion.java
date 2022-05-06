package com.string.examples;

public class StringReverseRecursion {
    public static void main(String[] args) {
        System.out.println(reverseString("Ranga"));
    }

    private static String reverseString(String str){
       if(str.length() == 1){
           return str;
       }
       return reverseString(str.substring(1))+str.charAt(0);
    }
}
