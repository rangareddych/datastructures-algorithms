package com.string.examples;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Print the first non-repeated character from String
 */
public class FirstUniqueChar {
    public static void main(String[] args) {
        FirstUniqueChar obj = new FirstUniqueChar();
        System.out.println(obj.getFirstUniqueChar("RangaReddy"));
    }
    private Character getFirstUniqueChar(String str){
        Map<Character, Integer> map = new LinkedHashMap<>(str.length());
        for (Character ch: str.toCharArray()){
            map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }
}
