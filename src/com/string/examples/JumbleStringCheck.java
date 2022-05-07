package com.string.examples;

public class JumbleStringCheck {
    public static void main(String[] args) {
        System.out.println(checkCorrectJumble("abc", "123", "a1b2c3"));
        System.out.println(checkCorrectJumble("abc", "123", "a1b3c2"));
        System.out.println(checkCorrectJumble("abc", "123", "a1b23c"));
        System.out.println(checkCorrectJumble("abc", "123", "a1c23b"));
    }

    private static boolean checkCorrectJumble(String s1, String s2, String s3){

        if(s1.length() != s2.length()){
            return false;
        }
        int s1Index = 0, s2Index = 0;
        for(int i=0; i < s3.length(); i++){
            if( s1Index < s1.length() && (s3.charAt(i) == s1.charAt(s1Index))){
                s1Index++;
                continue;
            } else if(s2Index < s2.length() && (s3.charAt(i) == s2.charAt(s2Index))){
                s2Index++;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
