package com.coding.handson;

//Find city wise second highest salary

import java.util.*;
import java.util.stream.Collectors;

public class Scenario1 {

    public static void main(String[] args) {
        List<employee> emp = new ArrayList<>(Arrays.asList(
                new employee(1, 10010.0,"chennai", "Laav"),
                new employee(2, 100.0,"TVM", "Laav"),
                new employee(3, 1010.0,"chennai", "Laav"),
                new employee(4, 100.0,"chennai", "Laav")
                ));

        Map<String, Optional<Double>> map =emp.stream().collect(Collectors.groupingBy(e->e.getCity(),
                Collectors.mapping(e-> e.getSalary(),Collectors.collectingAndThen(
                        Collectors.toSet(),set -> set.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                ))));
        System.out.println(map);


    }
}

class employee {
        int ID;
        Double Salary ;
        String City;
        String name;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public Double getSalary() {
            return Salary;
        }

        public void setSalary(Double salary) {
            Salary = salary;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String city) {
            City = city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public employee(int ID, Double salary, String city, String name) {
            this.ID = ID;
            Salary = salary;
            City = city;
            this.name = name;
        }
}
