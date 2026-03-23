package com.coding.handson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Notes: groupingBy(key) → basic grouping
//mapping() → transform values inside group

//You have set of email ID group by it's domain name
public class scenario3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("l@gmail.com", "KKK@outlook.com", "jj@gmail.com","w@yahoo.com", "fff@yahoo.com");
        // Count mail Id based on domain name
        list.stream().map(e-> e.split("@")[1])
                .collect(Collectors.groupingBy(e-> e, Collectors.counting()))
                .forEach((k,v)-> System.out.println(k + "  "+v));

        //Group mail ID based on domain name
        list.stream()
                .collect(Collectors.groupingBy(e->e.split("@")[1]))
                .forEach((k,v)-> System.out.println(k + "  "+v));

        //Group mail ID based on domain name also convert mail id to all lowercase
        list.stream()
                .collect(Collectors.groupingBy(e->e.split("@")[1]
                        ,Collectors.mapping(
                                e->e.toLowerCase() , Collectors.toList()
                        )))
                .forEach((k,v)-> System.out.println(k + "  "+v));
        //Group mail ID based on domain name also convert mail id to all lowercase and sort by its size
        list.stream()
                .collect(Collectors.groupingBy(e->e.split("@")[1]
                        ,Collectors.mapping(
                                e->e.toLowerCase() , Collectors.toList()
                        )))
                .entrySet().stream()
                .sorted((e1,e2)-> e2.getValue().size() -e1.getValue().size())
                .forEach(e-> System.out.println(e.getKey() + " "+e.getValue()));

    }

}
