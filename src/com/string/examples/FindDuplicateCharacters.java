package com.string.examples;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

    public static void main(String[] args) {
        FindDuplicateCharacters obj = new FindDuplicateCharacters();
        obj.printDuplicateCharacters("SwamyRangaReddy");
    }

    private void printDuplicateCharacters(String s){
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch : chars){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }

        map.entrySet().stream().filter( entry -> entry.getValue()>1).forEach(e -> System.out.println(e.getKey() + " : "+e.getValue()));
    }
}
