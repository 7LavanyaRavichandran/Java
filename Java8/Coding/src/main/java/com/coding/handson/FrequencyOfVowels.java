package com.coding.handson;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfVowels {
    public static void main(String[] args) {
        //indexOf(e) → returns the position of character e in "aeiou"
        //If the character is not found, it returns -1

        //Count occurence of vowels from Array of string
        String[] str = {"aaaaa","uuuu","wwwwwww"};
        Map<Character, Long> result = Arrays.stream(str).flatMap(s-> s.chars().mapToObj(c-> (char)c))
                .filter(c->"aeiou".indexOf(c)!= -1)
                .collect(Collectors.groupingBy(e-> e,Collectors.counting()));
        System.out.println(result);

        //Count occurence of non-vowels from a string
        String str1 = "Lavanya";
        Arrays.stream(str1.split("")).filter(e-> "aeiou".indexOf(e)!= -1)
                .collect(Collectors.groupingBy(e->e, LinkedHashMap::new ,Collectors.counting()))
                .forEach((k,v)-> System.out.println(k + " " +v+ " "));

        //Print String with high vowel count from a Array of string
        Arrays.stream(str)
                .collect(Collectors.groupingBy(
                        e->e.chars().filter(c-> "aeiou".indexOf(c)!=-1).count()))
                .entrySet().stream().sorted(Map.Entry.<Long, List<String>>comparingByKey().reversed())
               // .findFirst().ifPresent(System.out::println);
                .forEach(e-> System.out.println(e.getKey() + "  "+e.getValue()));
    }
}
