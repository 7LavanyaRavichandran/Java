package com.coding.handson.distinct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DistinctFeature {

    public static void main(String[] args) {
        List<EmployeeRecord> em = new ArrayList<>(Arrays.asList(
                new EmployeeRecord(1, "Lavanya", "IT", 10.0),
                new EmployeeRecord(1, "Lavanya", "IT", 10.0),
                new EmployeeRecord(2, "Lavanya", "BPO", 12.0),
                new EmployeeRecord(2, "Lavanya", "BPO", 12.0),
                new EmployeeRecord(3, "Kavya",   "IT", 11.0),
                new EmployeeRecord(4, "Kavya",   "Finance", 15.0),
                new EmployeeRecord(5, "Manu",    "ITt", 13.0)
        ));
        System.out.println("Check the object of employee are same for same data em.get(0).equals(em.get(1)): "+em.get(0).equals(em.get(1)));
       List<EmployeeRecord> employeeRecordDistinct = em.stream().distinct().collect(Collectors.toList());
       System.out.println(employeeRecordDistinct);
       //distinctByKey --> utility method helps to compare unique field from object
        List<EmployeeRecord> employeeRecordDistinctByKey = em.stream().filter(distinctByKey(EmployeeRecord::name))
                .collect(Collectors.toList());
       System.out.println(employeeRecordDistinctByKey);

       // ------------------------------------------------------------
        List<Employee> em1 = new ArrayList<>(Arrays.asList(
                new Employee(1, "Lavanya", "IT", 10.0),
                new Employee(1, "Lavanya", "IT", 10.0),
                new Employee(2, "Lavanya", "BPO", 12.0),
                new Employee(2, "Lavanya", "BPO", 12.0),
                new Employee(3, "Kavya",   "IT", 11.0),
                new Employee(4, "Kavya",   "Finance", 15.0),
                new Employee(5, "Manu",    "ITt", 13.0)
        ));
        List<Employee> employeeClassDistinct  = em1.stream().distinct().toList();
        System.out.println("employeeClassDistinct "+ employeeClassDistinct);

        // ------------------------------------------------------------
    }


    //  distinctByKey : custom utility methods
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }



}
