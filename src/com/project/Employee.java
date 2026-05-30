package com.project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private int age;
    private String name;
    private Double sal;

    public Employee(int age, String name, Double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public static void main(String[] args) {

        List<Employee> employees= Arrays.asList(new Employee(24,"Suresh",2000d),
                new Employee(25,"Amit",3000d),
                new Employee(24,"Naresh",5000d),
                 new Employee(20,"Amit",5000d))   ;


        Comparator<Employee> nameComp=Comparator.comparing(employee -> employee.getName());
        Comparator<Employee> ageComp=Comparator.comparing(employee -> employee.getAge());
       ;

        Collections.sort(employees,nameComp.thenComparing(ageComp));
        employees.forEach(employee -> {
            System.out.println(employee.getName() +" "+employee.getAge());
        });



    }
}
