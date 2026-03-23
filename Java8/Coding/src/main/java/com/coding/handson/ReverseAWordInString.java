package com.coding.handson;

import java.util.Arrays;

public class ReverseAWordInString {
    public static void main(String[] args) {
        String s="I aaak aaaa ssss www";
        String ss = Arrays.stream(s.split(" ")).reduce((a,b)->b+" "+a).orElse("");
        System.out.println(ss);
    }
}
