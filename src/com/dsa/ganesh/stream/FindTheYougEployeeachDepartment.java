package com.dsa.ganesh.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheYougEployeeachDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(

                new Employee(1, "Ganesh", "IT", 30, 50000),
                new Employee(2, "Rahul", "IT", 25, 70000),
                new Employee(3, "Suresh", "IT", 35, 60000),
                new Employee(4, "Amit", "HR", 28, 40000),
                new Employee(5, "Priya", "HR", 22, 60000),
                new Employee(6, "John", "Admin", 40, 45000),
                new Employee(7, "David", "Admin", 32, 55000)
        );
        System.out.println("find youngest employee each department"+employees.stream().
                collect(Collectors
                        .groupingBy(Employee::getDepartment,
                                Collectors
                                        .collectingAndThen(Collectors.minBy(Comparator.comparing(Employee::getAge)),opt->opt.get()))));


        System.out.println("find oldest employee each department"+employees.stream().
                collect(Collectors
                        .groupingBy(Employee::getDepartment,
                                Collectors
                                        .collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)),opt->opt.get()))));

    }
}
