package com.string.examples;

/**
 * Check if two Strings are anagrams of each other?
 */
public class AnagramChecker {

    public static void main(String[] args) {
        AnagramChecker obj = new AnagramChecker();
        System.out.println(obj.isAnagram("", ""));
        System.out.println(obj.isAnagram(null, null));
        System.out.println(obj.isAnagram("abc", "bca"));
        System.out.println(obj.isAnagram("abc", null));
        System.out.println(obj.isAnagram(null, "abc"));
        System.out.println(obj.isAnagram("abc", "xyz"));
    }

    private boolean isAnagram(String word1, String word2){

        if ((word1 == null && word2 != null) || (word1 != null && word2 == null))
            return false;
        else if((word1 ==null && word2 == null) || (word1.isEmpty() && word2.isEmpty()))
            return true;
        else if(word1.length() != word2.length()){
            return false;
        }

        for(char ch: word1.toCharArray()){
            int index = word2.indexOf(ch);
            if(index == -1){
                return false;
            }
            word2 = word2.substring(0, index)+word2.substring(index+1, word2.length());
        }

        return word2.isEmpty();
    }
}
