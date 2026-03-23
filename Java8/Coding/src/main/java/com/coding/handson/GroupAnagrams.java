package com.coding.handson;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("bat","taB","Madam", "amDam", "tba");

        Map<String, List<String>> result = list.stream().map(e->e.toLowerCase())
                .collect(Collectors.groupingBy(
                        e -> {
                            char[] chars = e.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars);
                        }
                        ));
        System.out.println(result.values());

        char[] ch = "laav".toCharArray();
        Arrays.sort(ch);
        System.out.println(ch.toString());
        System.out.println(new String(ch));
        System.out.println( String.valueOf(ch) );

    }

}
