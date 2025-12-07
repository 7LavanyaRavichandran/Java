package com.coding.handson.distinct;

public record EmployeeRecord(int ID,
                             String name,
                             String Department,
                             Double salary) {

    //In record class equals, hashcode ,getter, setter ,constructor is auto generated
}


