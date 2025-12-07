package com.coding.handson;
/*
Find the second highest salary from List<Employee>
Handle duplicates
Handle empty list
Use Streams

Variants:
Without using sorted()  --> *** reduce (
Using Comparator.comparing()
With grouping by department
 */

import com.coding.handson.distinct.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighestSalary {


    public static void main(String[] args) {

        List<Employee> em = new ArrayList<>(Arrays.asList(
                new Employee(1, "Lav",  "IT", 17.0),
                new Employee(1, "Lav",  "IT", 19.0),
                new Employee(1, "Lav",  "IT", 18.0),
                new Employee(1, "Lav",  "IT", 20.0),
                new Employee(2, "Laav", "BPO",11.0)
        ));
        Map<String, Optional<Double>> secondHighestByDept =
                em.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.mapping(
                                        Employee::getSalary,
                                        Collectors.collectingAndThen(
                                                Collectors.toSet(),
                                                s -> s.stream()
                                                        .sorted(Comparator.reverseOrder())
                                                        .skip(1)
                                                        .findFirst()
                                        )
                                )
                        ));
        System.out.println(secondHighestByDept);

        em.stream().map(e->e.getDepartment()).sorted().skip(1).findFirst().ifPresent(System.out:: println);

    }
}
