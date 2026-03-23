package com.coding.handson;

import java.util.Arrays;
import java.util.Optional;

public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {54,25,90,100};
     Arrays.stream(salary).average().ifPresent(System.out::println);
    }

}
