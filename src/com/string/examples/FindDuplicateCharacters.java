package com.string.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharacters {

    public static void main(String[] args) {
        FindDuplicateCharacters obj = new FindDuplicateCharacters();
        obj.printDuplicateCharacters("SwamyRangaReddy");
    }

    private void printDuplicateCharacters(String s){
        Map<Character,Long> map = s.chars().mapToObj(c->
                (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));

        map.entrySet().stream().filter( entry -> entry.getValue()>1).forEach(e -> System.out.println(e.getKey() + " : "+e.getValue()));
    }
}
