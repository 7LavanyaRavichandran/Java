package com.coding.handson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//You have list of string with name as "Firstname Secondname". Sort by secondname.
public class Scenario2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("R Lavanya","D Sri", "P Lavanya","D Laavanya");
        list.stream().map( e-> e.trim())
                .sorted(Comparator.comparing(names -> names.split(" ")[1]))
                .forEach(System.out::println);
            }
}
