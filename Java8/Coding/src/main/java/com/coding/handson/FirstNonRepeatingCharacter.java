package com.coding.handson;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String s = "wwnweeeei";
      Character ss =s.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(map-> map, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
              .map(Map.Entry::getKey)
                .findFirst()
              .orElse(null);
        System.out.println(ss);

    }
}
