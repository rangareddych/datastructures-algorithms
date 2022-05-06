package com.string.examples;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(reverse("ranga"));
        System.out.println(reverse("abcd"));
    }

    private static String reverse(String str){
        char[] chars = new char[str.length()];
        if(str.length() % 2 != 0)
            chars[str.length()/2] = str.charAt(str.length()/2);
        for(int i=0; i <= str.length()/2; i++){
            chars[i] = str.charAt(str.length()-1-i);
            chars[str.length()-1 - i] = str.charAt(i);
        }
        return String.valueOf(chars);
    }
}
