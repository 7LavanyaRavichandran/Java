package com.coding.handson.distinct;

import java.util.Objects;

public class Employee {

    int ID;
    String name;
    String Department;
    static Double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int ID, String name, String department, Double salary) {
        this.ID = ID;
        this.name = name;
        Department = department;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    //To compare all fields of class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj== null || getClass()!= obj.getClass()) return false;
        Employee other  = (Employee) obj;
        return ID == other.ID &&
                Double.compare(salary, other.salary) == 0 &&
                Objects.equals(name, other.name) &&
                Objects.equals(Department, other.Department);
    }

    @Override
    public int hashCode(){
        return Objects.hash(ID,name,salary,Department);
    }

    /*
    //To compare specif fiels of class
    @Override
   public boolean equals(Object obj){
       if(this == obj) return true;
       if(obj==null|| getClass()!=obj.getClass()) return false;
       Employee other = (Employee) obj;
       return Double.compare(salary,other.salary) ==0;

    }
    @Override
    public int hashCode(){
        return Objects.hash(salary);
    }
    */


}
